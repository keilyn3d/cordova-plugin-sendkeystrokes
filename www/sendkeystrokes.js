
window.sendKeystroke = function(type, key, meta, callback) {
    cordova.exec(callback, console.error, "SendKeystrokes", "sendKeystroke", [type,key, meta]);
};
