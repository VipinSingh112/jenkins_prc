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
 * The table class for the &quot;nbp_janaac_add_lab_med_dec_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalDescOfActiSec
 * @generated
 */
public class AddLabMedicalDescOfActiSecTable
	extends BaseTable<AddLabMedicalDescOfActiSecTable> {

	public static final AddLabMedicalDescOfActiSecTable INSTANCE =
		new AddLabMedicalDescOfActiSecTable();

	public final Column<AddLabMedicalDescOfActiSecTable, Long>
		addLabMedicalDescOfActiSecId = createColumn(
			"addLabMedicalDescOfActiSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabMedicalDescOfActiSecTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, String> requestedPoct =
		createColumn(
			"requestedPoct", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabMedicalDescOfActiSecTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabMedicalDescOfActiSecTable() {
		super(
			"nbp_janaac_add_lab_med_dec_sec",
			AddLabMedicalDescOfActiSecTable::new);
	}

}