import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
public class VinePapaStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new VinePapaIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("amzn1.ask.skill.81fe557a-bf44-4c1a-9e3e-ae35965acbe1") //aici trebuie schimbat
                .build();
    }
    public VinePapaStreamHandler() {
        super(getSkill());
    }
}