
-- Server version: 5.7.26
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `SH_DATABASE`
--

-- --------------------------------------------------------

--
-- Table structure for table `ATTENDANCE`
--

CREATE TABLE `ATTENDANCE` (
  `id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `time` time NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ATTENDANCE`
--

INSERT INTO `ATTENDANCE` (`id`, `student_id`, `time`, `date`) VALUES
(1, 1, '19:59:00', '2020-09-12'),
(2, 2, '14:59:00', '2020-09-12'),
(3, 3, '15:59:00', '2020-09-12'),
(4, 4, '16:59:00', '2020-09-12'),
(5, 5, '17:59:00', '2020-09-12');

-- --------------------------------------------------------

--
-- Table structure for table `BEHAVIOUR`
--

CREATE TABLE `BEHAVIOUR` (
  `id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `behaviour` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `EXCERCISES`
--

CREATE TABLE `EXCERCISES` (
  `id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `subject_teacher` int(11) NOT NULL,
  `subject` int(11) NOT NULL,
  `score` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `FINAL_EXAM`
--

CREATE TABLE `FINAL_EXAM` (
  `id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `subject` int(11) NOT NULL,
  `invigilator` int(11) NOT NULL,
  `exam_score` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `GENDER`
--

CREATE TABLE `GENDER` (
  `id` int(11) NOT NULL,
  `name_of_gender` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `GENDER`
--

INSERT INTO `GENDER` (`id`, `name_of_gender`) VALUES
(1, 'Male'),
(2, 'Female');

-- --------------------------------------------------------

--
-- Table structure for table `STUDENTS_DATA`
--

CREATE TABLE `STUDENTS_DATA` (
  `id` int(11) NOT NULL,
  `name` text,
  `gender` int(11) DEFAULT NULL,
  `date_of_birth` text,
  `email` text,
  `address` text,
  `parent_mobile` text,
  `parent_email` text,
  `guardian_address` text,
  `guardian_email` text,
  `guardian_mobile` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `STUDENTS_DATA`
--

INSERT INTO `STUDENTS_DATA` (`id`, `name`, `gender`, `date_of_birth`, `email`, `address`, `parent_mobile`, `parent_email`, `guardian_address`, `guardian_email`, `guardian_mobile`) VALUES
(1, 'Papa Duodu Fynn', 1, '2006-11-25', 'papafynn@avesacademy.com', 'Accra, Airpot Hills', 'none', 'none', 'none', 'none', 'none'),
(2, 'Kwabena Acheapong Baidoo', 1, '2006-4-7', 'kwabenabaidoo@avesacademy.com', 'Accra, Airpot Hills', 'none', 'none', 'none', 'none', 'none'),
(3, 'Papa Duodu Fynn', 1, '2006-11-25', 'papafynn@avesacademy.com', 'Accra, Airpot Hills', 'none', 'none', 'none', 'none', 'none'),
(4, 'Kwabena Acheapong Baidoo', 1, '2006-4-7', 'kwabenabaidoo@avesacademy.com', 'Accra, Airpot Hills', 'none', 'none', 'none', 'none', 'none'),
(5, 'Mark Anthony Made', 1, '2006-12-5', 'markmade@avesacademy.com', 'Accra, Airpot Hills', 'none', 'none', 'none', 'none', 'none'),
(6, 'Philip Fynn', NULL, NULL, 'philip@gmail.com', 'Accra, Airpot Hills', NULL, NULL, NULL, NULL, NULL),
(7, 'Papa Fynn', NULL, NULL, 'papap@gmail.com', 'Accra, Airpot Hills', NULL, NULL, NULL, NULL, NULL),
(8, 'Philip Fynn', NULL, NULL, 'philip@gmail.com', 'Accra, Airpot Hills', NULL, NULL, NULL, NULL, NULL),
(9, 'Papa Fynn', NULL, NULL, 'papap@gmail.com', 'Accra, Airpot Hills', NULL, NULL, NULL, NULL, NULL),
(10, 'Papa Fynn', NULL, NULL, 'papap@gmail.com', 'Accra, Airpot Hills', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `SUBJECT`
--

CREATE TABLE `SUBJECT` (
  `id` int(11) NOT NULL,
  `name_of_subject` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `SUBJECT`
--

INSERT INTO `SUBJECT` (`id`, `name_of_subject`) VALUES
(1, 'Mathematics'),
(2, 'Ad Maths'),
(3, 'Physics'),
(4, 'Economics'),
(5, 'Chemistry'),
(6, 'French'),
(7, 'Computer Science');

-- --------------------------------------------------------

--
-- Table structure for table `TEACHER`
--

CREATE TABLE `TEACHER` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `gender` int(11) NOT NULL,
  `date_of_birth` text NOT NULL,
  `mobile` text NOT NULL,
  `email` text NOT NULL,
  `address` text NOT NULL,
  `subject` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `TEACHER`
--

INSERT INTO `TEACHER` (`id`, `name`, `gender`, `date_of_birth`, `mobile`, `email`, `address`, `subject`) VALUES
(1, 'Sir Nathaniel', 1, '1999-11-1', '233244945904', 'nathanieloseiowusu@gmail.com', 'Devtraco,Tema', 4),
(2, 'Sir Peter', 1, '1992-1-1', '233244945904', 'peterkupualor@gmail.com', 'Tema, Community 21', 4);

-- --------------------------------------------------------

--
-- Table structure for table `TIMETABLE`
--

CREATE TABLE `TIMETABLE` (
  `id` int(11) NOT NULL,
  `subject` int(11) NOT NULL,
  `subject_teacher` int(11) NOT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ATTENDANCE`
--
ALTER TABLE `ATTENDANCE`
  ADD PRIMARY KEY (`id`),
  ADD KEY `attendance_student_id_fk` (`student_id`);

--
-- Indexes for table `BEHAVIOUR`
--
ALTER TABLE `BEHAVIOUR`
  ADD PRIMARY KEY (`id`),
  ADD KEY `behaviour_student_id_fk` (`student_id`);

--
-- Indexes for table `EXCERCISES`
--
ALTER TABLE `EXCERCISES`
  ADD PRIMARY KEY (`id`),
  ADD KEY `exercise_student_id_fk` (`student_id`),
  ADD KEY `exercise_teacher_id_fk` (`subject_teacher`),
  ADD KEY `exercise_subject_id_fk` (`subject`);

--
-- Indexes for table `FINAL_EXAM`
--
ALTER TABLE `FINAL_EXAM`
  ADD PRIMARY KEY (`id`),
  ADD KEY `final_exam_student_id_fk` (`student_id`),
  ADD KEY `final_exam_teacher_id_fk` (`invigilator`),
  ADD KEY `final_exam_subject_id_fk` (`subject`);

--
-- Indexes for table `GENDER`
--
ALTER TABLE `GENDER`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `STUDENTS_DATA`
--
ALTER TABLE `STUDENTS_DATA`
  ADD PRIMARY KEY (`id`),
  ADD KEY `students_data_gender_id_fk` (`gender`);

--
-- Indexes for table `SUBJECT`
--
ALTER TABLE `SUBJECT`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `TEACHER`
--
ALTER TABLE `TEACHER`
  ADD PRIMARY KEY (`id`),
  ADD KEY `teacher_gender_id_fk` (`gender`),
  ADD KEY `teacher_subject_id_fk` (`subject`);

--
-- Indexes for table `TIMETABLE`
--
ALTER TABLE `TIMETABLE`
  ADD PRIMARY KEY (`id`),
  ADD KEY `timetable_teacher_id_fk` (`subject_teacher`),
  ADD KEY `timetable_subject_id_fk` (`subject`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ATTENDANCE`
--
ALTER TABLE `ATTENDANCE`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `BEHAVIOUR`
--
ALTER TABLE `BEHAVIOUR`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `EXCERCISES`
--
ALTER TABLE `EXCERCISES`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `FINAL_EXAM`
--
ALTER TABLE `FINAL_EXAM`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `GENDER`
--
ALTER TABLE `GENDER`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `STUDENTS_DATA`
--
ALTER TABLE `STUDENTS_DATA`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `SUBJECT`
--
ALTER TABLE `SUBJECT`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `TEACHER`
--
ALTER TABLE `TEACHER`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `TIMETABLE`
--
ALTER TABLE `TIMETABLE`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ATTENDANCE`
--
ALTER TABLE `ATTENDANCE`
  ADD CONSTRAINT `attendance_student_id_fk` FOREIGN KEY (`student_id`) REFERENCES `STUDENTS_DATA` (`id`);

--
-- Constraints for table `BEHAVIOUR`
--
ALTER TABLE `BEHAVIOUR`
  ADD CONSTRAINT `behaviour_student_id_fk` FOREIGN KEY (`student_id`) REFERENCES `STUDENTS_DATA` (`id`);

--
-- Constraints for table `EXCERCISES`
--
ALTER TABLE `EXCERCISES`
  ADD CONSTRAINT `exercise_student_id_fk` FOREIGN KEY (`student_id`) REFERENCES `STUDENTS_DATA` (`id`),
  ADD CONSTRAINT `exercise_subject_id_fk` FOREIGN KEY (`subject`) REFERENCES `SUBJECT` (`id`),
  ADD CONSTRAINT `exercise_teacher_id_fk` FOREIGN KEY (`subject_teacher`) REFERENCES `TEACHER` (`id`);

--
-- Constraints for table `FINAL_EXAM`
--
ALTER TABLE `FINAL_EXAM`
  ADD CONSTRAINT `final_exam_student_id_fk` FOREIGN KEY (`student_id`) REFERENCES `STUDENTS_DATA` (`id`),
  ADD CONSTRAINT `final_exam_subject_id_fk` FOREIGN KEY (`subject`) REFERENCES `SUBJECT` (`id`),
  ADD CONSTRAINT `final_exam_teacher_id_fk` FOREIGN KEY (`invigilator`) REFERENCES `TEACHER` (`id`);

--
-- Constraints for table `STUDENTS_DATA`
--
ALTER TABLE `STUDENTS_DATA`
  ADD CONSTRAINT `students_data_gender_id_fk` FOREIGN KEY (`gender`) REFERENCES `GENDER` (`id`);

--
-- Constraints for table `TEACHER`
--
ALTER TABLE `TEACHER`
  ADD CONSTRAINT `teacher_gender_id_fk` FOREIGN KEY (`gender`) REFERENCES `GENDER` (`id`),
  ADD CONSTRAINT `teacher_subject_id_fk` FOREIGN KEY (`subject`) REFERENCES `SUBJECT` (`id`);

--
-- Constraints for table `TIMETABLE`
--
ALTER TABLE `TIMETABLE`
  ADD CONSTRAINT `timetable_subject_id_fk` FOREIGN KEY (`subject`) REFERENCES `SUBJECT` (`id`),
  ADD CONSTRAINT `timetable_teacher_id_fk` FOREIGN KEY (`subject_teacher`) REFERENCES `TEACHER` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
