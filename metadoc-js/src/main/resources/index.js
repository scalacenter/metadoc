/*
 * Register external libraries for use by the Scala.js bundle.
 */

// Scala tokenizer and syntax highlighting
window.ScalaLanguage = require('./scala.ts');

/*
 * Load additional resources.
 */

require('node_modules/material-design-icons/iconfont/material-icons.css')
require('node_modules/material-components-web/dist/material-components-web.css')
var mdc = require('node_modules/material-components-web/dist/material-components-web.js')

mdc.autoInit()
var drawerEl = document.querySelector('.mdc-temporary-drawer');
var MDCTemporaryDrawer = mdc.drawer.MDCTemporaryDrawer;
var drawer = new MDCTemporaryDrawer(drawerEl);
document.querySelector('.metadoc-menu').addEventListener('click', function() {
  drawer.open = true;
});

require('./index.scss')
