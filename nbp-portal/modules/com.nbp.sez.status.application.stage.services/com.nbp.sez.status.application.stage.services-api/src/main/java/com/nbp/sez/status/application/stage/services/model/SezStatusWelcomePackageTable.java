/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_status_welcome_pack&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWelcomePackage
 * @generated
 */
public class SezStatusWelcomePackageTable
	extends BaseTable<SezStatusWelcomePackageTable> {

	public static final SezStatusWelcomePackageTable INSTANCE =
		new SezStatusWelcomePackageTable();

	public final Column<SezStatusWelcomePackageTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, Long> sezStatusWelcomeId =
		createColumn(
			"sezStatusWelcomeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezStatusWelcomePackageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, Date>
		dateWelcomePackageSigned = createColumn(
			"dateWelcomePackageSigned", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, Date>
		welcomePackageSubmitToAppli = createColumn(
			"welcomePackageSubmitToAppli", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusWelcomePackageTable, Long> docLicFileEntryId =
		createColumn(
			"docLicFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SezStatusWelcomePackageTable() {
		super("nbp_sez_status_welcome_pack", SezStatusWelcomePackageTable::new);
	}

}