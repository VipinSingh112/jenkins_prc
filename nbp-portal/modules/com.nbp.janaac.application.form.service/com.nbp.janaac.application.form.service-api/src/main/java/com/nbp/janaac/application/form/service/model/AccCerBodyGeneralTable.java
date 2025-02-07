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
 * The table class for the &quot;nbp_janaac_acc_cer_general&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyGeneral
 * @generated
 */
public class AccCerBodyGeneralTable extends BaseTable<AccCerBodyGeneralTable> {

	public static final AccCerBodyGeneralTable INSTANCE =
		new AccCerBodyGeneralTable();

	public final Column<AccCerBodyGeneralTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, Long> accCerBodyGeneralId =
		createColumn(
			"accCerBodyGeneralId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccCerBodyGeneralTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, String> cerLegalEntity =
		createColumn(
			"cerLegalEntity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, String> cerLegalStatusEntity =
		createColumn(
			"cerLegalStatusEntity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, String> cerMajorIncomeSources =
		createColumn(
			"cerMajorIncomeSources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyGeneralTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccCerBodyGeneralTable() {
		super("nbp_janaac_acc_cer_general", AccCerBodyGeneralTable::new);
	}

}