import java.io.IOException;

import javax.swing.*;

public class MAIN {

    private static boolean failed = false;

    public static void main(String[] args) {
        try {
            new Installer().downloadUsingNIO("https://ci.nukkitx.com/job/NukkitX/job/master/lastSuccessfulBuild/artifact/target/nukkit-1.0-SNAPSHOT.jar","nukkit.jar");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Download failed. Please try again.");
            failed = true;
        }

        if (!failed) {
            JOptionPane.showMessageDialog(null, "Download completed! Run nukkit.jar to continue the nukkit installation!");
        }
    }
}
