/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsoIIssuanceOfReportException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi inso i issuance of report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsoIIssuanceOfReportUtil
 * @generated
 */
@ProviderType
public interface OsiInsoIIssuanceOfReportPersistence
	extends BasePersistence<OsiInsoIIssuanceOfReport> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsoIIssuanceOfReportUtil} to access the osi inso i issuance of report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or throws a <code>NoSuchOsiInsoIIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inso i issuance of report
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a matching osi inso i issuance of report could not be found
	 */
	public OsiInsoIIssuanceOfReport findBygetOSIIRIssuanceOfReportBy_CI(
			String caseId)
		throws NoSuchOsiInsoIIssuanceOfReportException;

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inso i issuance of report, or <code>null</code> if a matching osi inso i issuance of report could not be found
	 */
	public OsiInsoIIssuanceOfReport fetchBygetOSIIRIssuanceOfReportBy_CI(
		String caseId);

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inso i issuance of report, or <code>null</code> if a matching osi inso i issuance of report could not be found
	 */
	public OsiInsoIIssuanceOfReport fetchBygetOSIIRIssuanceOfReportBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi inso i issuance of report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi inso i issuance of report that was removed
	 */
	public OsiInsoIIssuanceOfReport removeBygetOSIIRIssuanceOfReportBy_CI(
			String caseId)
		throws NoSuchOsiInsoIIssuanceOfReportException;

	/**
	 * Returns the number of osi inso i issuance of reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inso i issuance of reports
	 */
	public int countBygetOSIIRIssuanceOfReportBy_CI(String caseId);

	/**
	 * Caches the osi inso i issuance of report in the entity cache if it is enabled.
	 *
	 * @param osiInsoIIssuanceOfReport the osi inso i issuance of report
	 */
	public void cacheResult(OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport);

	/**
	 * Caches the osi inso i issuance of reports in the entity cache if it is enabled.
	 *
	 * @param osiInsoIIssuanceOfReports the osi inso i issuance of reports
	 */
	public void cacheResult(
		java.util.List<OsiInsoIIssuanceOfReport> osiInsoIIssuanceOfReports);

	/**
	 * Creates a new osi inso i issuance of report with the primary key. Does not add the osi inso i issuance of report to the database.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key for the new osi inso i issuance of report
	 * @return the new osi inso i issuance of report
	 */
	public OsiInsoIIssuanceOfReport create(long osiInsoIIssuanceOfReportId);

	/**
	 * Removes the osi inso i issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report that was removed
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a osi inso i issuance of report with the primary key could not be found
	 */
	public OsiInsoIIssuanceOfReport remove(long osiInsoIIssuanceOfReportId)
		throws NoSuchOsiInsoIIssuanceOfReportException;

	public OsiInsoIIssuanceOfReport updateImpl(
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport);

	/**
	 * Returns the osi inso i issuance of report with the primary key or throws a <code>NoSuchOsiInsoIIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a osi inso i issuance of report with the primary key could not be found
	 */
	public OsiInsoIIssuanceOfReport findByPrimaryKey(
			long osiInsoIIssuanceOfReportId)
		throws NoSuchOsiInsoIIssuanceOfReportException;

	/**
	 * Returns the osi inso i issuance of report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report, or <code>null</code> if a osi inso i issuance of report with the primary key could not be found
	 */
	public OsiInsoIIssuanceOfReport fetchByPrimaryKey(
		long osiInsoIIssuanceOfReportId);

	/**
	 * Returns all the osi inso i issuance of reports.
	 *
	 * @return the osi inso i issuance of reports
	 */
	public java.util.List<OsiInsoIIssuanceOfReport> findAll();

	/**
	 * Returns a range of all the osi inso i issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsoIIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inso i issuance of reports
	 * @param end the upper bound of the range of osi inso i issuance of reports (not inclusive)
	 * @return the range of osi inso i issuance of reports
	 */
	public java.util.List<OsiInsoIIssuanceOfReport> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi inso i issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsoIIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inso i issuance of reports
	 * @param end the upper bound of the range of osi inso i issuance of reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi inso i issuance of reports
	 */
	public java.util.List<OsiInsoIIssuanceOfReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsoIIssuanceOfReport> orderByComparator);

	/**
	 * Returns an ordered range of all the osi inso i issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsoIIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inso i issuance of reports
	 * @param end the upper bound of the range of osi inso i issuance of reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi inso i issuance of reports
	 */
	public java.util.List<OsiInsoIIssuanceOfReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsoIIssuanceOfReport> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi inso i issuance of reports from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi inso i issuance of reports.
	 *
	 * @return the number of osi inso i issuance of reports
	 */
	public int countAll();

}