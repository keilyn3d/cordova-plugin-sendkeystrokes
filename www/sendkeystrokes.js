
window.sendKeystroke = function(type, key, callback) {
    cordova.exec(callback, console.error, "SendKeystrokes", "sendKeystroke", [type,key]);
};
