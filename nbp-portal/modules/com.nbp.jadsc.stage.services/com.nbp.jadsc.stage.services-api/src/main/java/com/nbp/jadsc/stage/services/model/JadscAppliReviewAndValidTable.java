/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jadsc_appli_review_veri&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValid
 * @generated
 */
public class JadscAppliReviewAndValidTable
	extends BaseTable<JadscAppliReviewAndValidTable> {

	public static final JadscAppliReviewAndValidTable INSTANCE =
		new JadscAppliReviewAndValidTable();

	public final Column<JadscAppliReviewAndValidTable, Long>
		jadscAppliReviewAndValidId = createColumn(
			"jadscAppliReviewAndValidId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JadscAppliReviewAndValidTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliReviewAndValidTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliReviewAndValidTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliReviewAndValidTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscAppliReviewAndValidTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliReviewAndValidTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliReviewAndValidTable, String>
		versionOfApplication = createColumn(
			"versionOfApplication", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JadscAppliReviewAndValidTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscAppliReviewAndValidTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JadscAppliReviewAndValidTable() {
		super(
			"nbp_jadsc_appli_review_veri", JadscAppliReviewAndValidTable::new);
	}

}