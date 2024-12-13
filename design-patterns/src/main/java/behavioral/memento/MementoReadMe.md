## Scenario

### Problem

At some point, you decide to allow users to undo or control actions performed on text. This feature is now expected in every app. To implement it, you take snapshots of the text and save them in storage. For example, you might take a snapshot every time a new word is added. When a user wants to undo something, the app retrieves the latest snapshot to restore the previous text.

However, producing these snapshots can be challenging. If the object has multiple fields, you may need to copy all their values into memory. For this to work, fields must be public, but many objects keep their important data private. The snapshots become objects of the same class with few methods and many fields that reflect the initial object's state. You must decide whether to make these fields public or use setters, which could create dependency on changes in the snapshot class, leading to issues with encapsulation.

### Solution

Well, the Memento Pattern is a Behavioral Design Pattern that delegates creating the state snapshots to the actual owner of that state. Hence, instead of other objects trying to copy the initial object's state from outside the class, the original class itself can make the snapshot since it has full access to its own state.