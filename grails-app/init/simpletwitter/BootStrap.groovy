package simpletwitter

class BootStrap {

    def init = { servletContext ->
        def tweet = new Tweet()
    }
    def destroy = {
    }
}
