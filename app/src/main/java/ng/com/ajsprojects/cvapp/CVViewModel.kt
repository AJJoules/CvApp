package ng.com.ajsprojects.cvapp

import androidx.lifecycle.ViewModel

class CVViewModel : ViewModel() {
    var originalCVData: CVData = CVData(
        name = "Ajibola Odujole || Slack id: AJ_Joules",
        email = "odujole.damilare@gmail.com",
        github = "https://www.github.com/aj_joules",
        phone = "08183543583",
        summary = "Estimator with over 3 years of experience" +
                " estimating new construction and renovation projects.",
        experience = "RedGrey Associates - Quantity Surveyor/ Project Manager\n" +
                "April 2022 - PRESENT\n" +
                "● Performed measurements for structural and architectural works to prepare cost estimates\n" +
                "for projects.\n" +
                "● Project Management for construction projects. Cost monitoring and control on projects\n" +
                "leading to savings for projects.\n" +
                "● Preparing contracts, budgets, bills of quantities, and contract documents.\n",
        education = "Yaba College of Technology, Lagos - Higher National Diploma, Quantity Surveying\n" +
                "November 2017 – November 2019 - Upper Credit\n" +
                "Yaba College of Technology, Lagos - National Diploma, Quantity Surveying\n" +
                "March 2014 – March 2017 - Lower Credit"
    )

    var editedCvData: CVData = originalCVData.copy()
}