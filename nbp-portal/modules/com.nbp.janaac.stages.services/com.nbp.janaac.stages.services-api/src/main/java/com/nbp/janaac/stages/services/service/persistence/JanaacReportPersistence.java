/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.stages.services.exception.NoSuchJanaacReportException;
import com.nbp.janaac.stages.services.model.JanaacReport;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the janaac report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacReportUtil
 * @generated
 */
@ProviderType
public interface JanaacReportPersistence extends BasePersistence<JanaacReport> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JanaacReportUtil} to access the janaac report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the janaac report where caseId = &#63; or throws a <code>NoSuchJanaacReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac report
	 * @throws NoSuchJanaacReportException if a matching janaac report could not be found
	 */
	public JanaacReport findBygetJanaac_by_caseId(String caseId)
		throws NoSuchJanaacReportException;

	/**
	 * Returns the janaac report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac report, or <code>null</code> if a matching janaac report could not be found
	 */
	public JanaacReport fetchBygetJanaac_by_caseId(String caseId);

	/**
	 * Returns the janaac report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac report, or <code>null</code> if a matching janaac report could not be found
	 */
	public JanaacReport fetchBygetJanaac_by_caseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the janaac report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac report that was removed
	 */
	public JanaacReport removeBygetJanaac_by_caseId(String caseId)
		throws NoSuchJanaacReportException;

	/**
	 * Returns the number of janaac reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac reports
	 */
	public int countBygetJanaac_by_caseId(String caseId);

	/**
	 * Caches the janaac report in the entity cache if it is enabled.
	 *
	 * @param janaacReport the janaac report
	 */
	public void cacheResult(JanaacReport janaacReport);

	/**
	 * Caches the janaac reports in the entity cache if it is enabled.
	 *
	 * @param janaacReports the janaac reports
	 */
	public void cacheResult(java.util.List<JanaacReport> janaacReports);

	/**
	 * Creates a new janaac report with the primary key. Does not add the janaac report to the database.
	 *
	 * @param janaacReportId the primary key for the new janaac report
	 * @return the new janaac report
	 */
	public JanaacReport create(long janaacReportId);

	/**
	 * Removes the janaac report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report that was removed
	 * @throws NoSuchJanaacReportException if a janaac report with the primary key could not be found
	 */
	public JanaacReport remove(long janaacReportId)
		throws NoSuchJanaacReportException;

	public JanaacReport updateImpl(JanaacReport janaacReport);

	/**
	 * Returns the janaac report with the primary key or throws a <code>NoSuchJanaacReportException</code> if it could not be found.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report
	 * @throws NoSuchJanaacReportException if a janaac report with the primary key could not be found
	 */
	public JanaacReport findByPrimaryKey(long janaacReportId)
		throws NoSuchJanaacReportException;

	/**
	 * Returns the janaac report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report, or <code>null</code> if a janaac report with the primary key could not be found
	 */
	public JanaacReport fetchByPrimaryKey(long janaacReportId);

	/**
	 * Returns all the janaac reports.
	 *
	 * @return the janaac reports
	 */
	public java.util.List<JanaacReport> findAll();

	/**
	 * Returns a range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @return the range of janaac reports
	 */
	public java.util.List<JanaacReport> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac reports
	 */
	public java.util.List<JanaacReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacReport>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac reports
	 */
	public java.util.List<JanaacReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacReport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the janaac reports from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of janaac reports.
	 *
	 * @return the number of janaac reports
	 */
	public int countAll();

}