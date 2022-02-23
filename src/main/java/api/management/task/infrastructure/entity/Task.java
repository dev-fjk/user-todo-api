package api.management.task.infrastructure.entity;

import api.management.task.domain.model.task.TaskRegister;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.ToString;

/**
 * タスクテーブル Entity
 */
@Getter
@ToString
public class Task {

    private long taskId;

    private long userId;

    private int statusId;

    private int priorityId;

    private LocalDate startDate;

    private LocalDate endDate;

    private LocalDate termDate;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

    private LocalDateTime deletedAt;

    private String deletedBy;

    private boolean isDeleted;

    /**
     * 追加に使用するtaskを生成
     *
     * @param register タスク登録情報
     * @return 登録用のTask
     */
    public static Task of(TaskRegister register) {
        final Task task = new Task();
        task.userId = register.getUserId();
        task.statusId = register.getStatusId();
        task.priorityId = register.getPriorityId();
        task.startDate = register.getStartDate();
        task.endDate = register.getEndDate();
        task.termDate = register.getTermDate();
        task.createdBy = String.valueOf(register.getUserId());
        task.updatedBy = String.valueOf(register.getUserId());
        return task;
    }
}
