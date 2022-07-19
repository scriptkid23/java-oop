
import os
import time
import requests
from threading import Thread

from telegram.ext.updater import Updater
from telegram.update import Update
from telegram.ext.callbackcontext import CallbackContext
from telegram.ext.commandhandler import CommandHandler
from telegram.ext.messagehandler import MessageHandler
from telegram.ext.filters import Filters
from dotenv import load_dotenv

load_dotenv()  # take environment variables from .env.


def main(bot_token) -> None:
    print("Bot Startup!")
    updater = Updater(bot_token, use_context=True)

    def checker(context):
        x = requests.get(
            'https://api.pancakeswap.info/api/v2/tokens/' + context.job.context['address'])
        price = float(x.json()['data']['price'])
        if(price > float(context.job.context['price'])):
            reply = {
                "message": "Sell now!",
                "price": price,
            }
            context.bot.send_message(
                chat_id=context.job.context['chat_id'], text=reply)

    def hello(context):
        context.bot.send_message(chat_id=context.job.context, text="Hi!")

    def start(update: Update, context: CallbackContext):
        update.message.reply_text("Processing...")
        if(len(context.args) > 1):

            context.job_queue.run_repeating(
                checker, 3, context={"chat_id": update.message.chat_id, "address": context.args[0], "price": context.args[1]}, name="checker")

    def stop(update: Update, context: CallbackContext):
        update.message.reply_text("Stop...")
        current_jobs = context.job_queue.get_jobs_by_name("checker")
        for job in current_jobs:
            job.schedule_removal()
    updater.dispatcher.add_handler(
        CommandHandler('start', start, pass_job_queue=True))
    updater.dispatcher.add_handler(
        CommandHandler('stop', stop, pass_job_queue=True))

    # Filters out unknown messages.
    
    updater.start_polling()
    updater.idle()


if __name__ == "__main__":
    main(bot_token=os.getenv('BOT_TOKEN'))
