package java21features;

public class Emoji {

    //Java has introduced the method in the ‘java.lang.Character’
    //class to work with different types of emoji’s properties
    public static void main(String[] args) {
        String messageWithEmoji = "Hello Java 21! 😄";
        // “👨” (0x1F468) and a rocket “🚀” (0x1F680)
        System.out.println(Character.isEmoji(0x1F468));
        boolean isEmojiChar = Character.isEmoji(Character.codePointAt("👨",0));
        boolean canHaveModifier = Character.isEmojiModifierBase('✋');
        System.out.println(isEmojiChar);
        System.out.println(canHaveModifier);
        System.out.println(messageWithEmoji.codePoints().anyMatch(Character::isEmoji));
        System.out.println((Character.isEmojiModifierBase(Character.codePointAt("👍", 0))));
        System.out.println(Character.isEmojiModifierBase(Character.codePointAt("👶", 0)));
        System.out.println(Character.isEmojiModifierBase(Character.codePointAt("🍕", 0)));
    }
}
