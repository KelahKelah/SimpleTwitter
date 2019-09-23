package simpletwitter

class BootStrap {

    def init = { servletContext ->
        if (Tweet.count() == 0) {
            new Tweet(message: 'My first tweet').save()
            new Tweet(message: 'i love twitter').save()
            new Tweet(message: 'whats on your mind').save()
        }

    }
    def destroy = {
    }
}
