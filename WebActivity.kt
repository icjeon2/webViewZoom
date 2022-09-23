// Apply this javascript code at the point finished webview loading. (Javascript)
private val mainWebViewClient by lazy {
        object : WebViewClient() {
            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }
            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                "document.querySelector(\"meta[name=viewport]\").setAttribute('content', 'width=device-width, initial-scale=0, maximum-scale=2.0, user-scalable=yes');"
                "document.querySelector(\"meta[name=viewport]\").setAttribute('content', 'width=device-width, initial-scale=1.0, maximum-scale=2.0, user-scalable=yes');"
             }
        }
}



// Apply this setting on your webView object. (kotlin)
webView.apply {
  settings.apply {
      javaScriptEnabled = true
      domStorageEnabled = true
      builtInZoomControls = true
      setSupportZoom(true)
  }
