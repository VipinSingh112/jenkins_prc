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
 * The table class for the &quot;nbp_janaac_add_lab_med_phy_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalSec
 * @generated
 */
public class AddLabMedicalPhysicalSecTable
	extends BaseTable<AddLabMedicalPhysicalSecTable> {

	public static final AddLabMedicalPhysicalSecTable INSTANCE =
		new AddLabMedicalPhysicalSecTable();

	public final Column<AddLabMedicalPhysicalSecTable, Long>
		addLabMedicalPhysicalSecId = createColumn(
			"addLabMedicalPhysicalSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabMedicalPhysicalSecTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, String> number =
		createColumn(
			"number_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, String>
		activitiesPerformed = createColumn(
			"activitiesPerformed", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, String> contactDetails =
		createColumn(
			"contactDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalPhysicalSecTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabMedicalPhysicalSecTable() {
		super(
			"nbp_janaac_add_lab_med_phy_sec",
			AddLabMedicalPhysicalSecTable::new);
	}

}