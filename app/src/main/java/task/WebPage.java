package task;

class WebPage {
    private final String url;
    private final String content;

    public WebPage(String url, String content) {
        this.url = url;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }
}