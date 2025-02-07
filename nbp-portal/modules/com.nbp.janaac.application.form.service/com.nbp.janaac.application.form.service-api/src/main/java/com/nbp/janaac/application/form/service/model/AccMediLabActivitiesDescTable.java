/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_acc_med_activity&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabActivitiesDesc
 * @generated
 */
public class AccMediLabActivitiesDescTable
	extends BaseTable<AccMediLabActivitiesDescTable> {

	public static final AccMediLabActivitiesDescTable INSTANCE =
		new AccMediLabActivitiesDescTable();

	public final Column<AccMediLabActivitiesDescTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, Long>
		accMediLabActivitiesDescId = createColumn(
			"accMediLabActivitiesDescId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabActivitiesDescTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, String>
		activitiesDescription = createColumn(
			"activitiesDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, String> shiftWork =
		createColumn(
			"shiftWork", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, String> specimenNo =
		createColumn(
			"specimenNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, String>
		specimenLocation = createColumn(
			"specimenLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, String> requestedPOCT =
		createColumn(
			"requestedPOCT", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, String>
		requestedPOCTLocation = createColumn(
			"requestedPOCTLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabActivitiesDescTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabActivitiesDescTable() {
		super(
			"nbp_janaac_acc_med_activity", AccMediLabActivitiesDescTable::new);
	}

}