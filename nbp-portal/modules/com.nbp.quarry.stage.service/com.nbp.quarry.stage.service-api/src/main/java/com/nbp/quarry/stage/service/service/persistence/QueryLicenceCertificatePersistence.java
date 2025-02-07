/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quarry.stage.service.exception.NoSuchQueryLicenceCertificateException;
import com.nbp.quarry.stage.service.model.QueryLicenceCertificate;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the query licence certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QueryLicenceCertificateUtil
 * @generated
 */
@ProviderType
public interface QueryLicenceCertificatePersistence
	extends BasePersistence<QueryLicenceCertificate> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QueryLicenceCertificateUtil} to access the query licence certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the query licence certificate where caseId = &#63; or throws a <code>NoSuchQueryLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	public QueryLicenceCertificate findBygetQueryLicenceCertificateBy_CI(
			String caseId)
		throws NoSuchQueryLicenceCertificateException;

	/**
	 * Returns the query licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	public QueryLicenceCertificate fetchBygetQueryLicenceCertificateBy_CI(
		String caseId);

	/**
	 * Returns the query licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	public QueryLicenceCertificate fetchBygetQueryLicenceCertificateBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the query licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the query licence certificate that was removed
	 */
	public QueryLicenceCertificate removeBygetQueryLicenceCertificateBy_CI(
			String caseId)
		throws NoSuchQueryLicenceCertificateException;

	/**
	 * Returns the number of query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching query licence certificates
	 */
	public int countBygetQueryLicenceCertificateBy_CI(String caseId);

	/**
	 * Returns all the query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificates
	 */
	public java.util.List<QueryLicenceCertificate>
		findBygetQueryLicenceCertificatBy_CI(String caseId);

	/**
	 * Returns a range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @return the range of matching query licence certificates
	 */
	public java.util.List<QueryLicenceCertificate>
		findBygetQueryLicenceCertificatBy_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query licence certificates
	 */
	public java.util.List<QueryLicenceCertificate>
		findBygetQueryLicenceCertificatBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QueryLicenceCertificate> orderByComparator);

	/**
	 * Returns an ordered range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query licence certificates
	 */
	public java.util.List<QueryLicenceCertificate>
		findBygetQueryLicenceCertificatBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QueryLicenceCertificate> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	public QueryLicenceCertificate findBygetQueryLicenceCertificatBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QueryLicenceCertificate> orderByComparator)
		throws NoSuchQueryLicenceCertificateException;

	/**
	 * Returns the first query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	public QueryLicenceCertificate fetchBygetQueryLicenceCertificatBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QueryLicenceCertificate> orderByComparator);

	/**
	 * Returns the last query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	public QueryLicenceCertificate findBygetQueryLicenceCertificatBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QueryLicenceCertificate> orderByComparator)
		throws NoSuchQueryLicenceCertificateException;

	/**
	 * Returns the last query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	public QueryLicenceCertificate fetchBygetQueryLicenceCertificatBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QueryLicenceCertificate> orderByComparator);

	/**
	 * Returns the query licence certificates before and after the current query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param queryLicenceCertificateId the primary key of the current query licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	public QueryLicenceCertificate[]
			findBygetQueryLicenceCertificatBy_CI_PrevAndNext(
				long queryLicenceCertificateId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<QueryLicenceCertificate> orderByComparator)
		throws NoSuchQueryLicenceCertificateException;

	/**
	 * Removes all the query licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetQueryLicenceCertificatBy_CI(String caseId);

	/**
	 * Returns the number of query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching query licence certificates
	 */
	public int countBygetQueryLicenceCertificatBy_CI(String caseId);

	/**
	 * Caches the query licence certificate in the entity cache if it is enabled.
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 */
	public void cacheResult(QueryLicenceCertificate queryLicenceCertificate);

	/**
	 * Caches the query licence certificates in the entity cache if it is enabled.
	 *
	 * @param queryLicenceCertificates the query licence certificates
	 */
	public void cacheResult(
		java.util.List<QueryLicenceCertificate> queryLicenceCertificates);

	/**
	 * Creates a new query licence certificate with the primary key. Does not add the query licence certificate to the database.
	 *
	 * @param queryLicenceCertificateId the primary key for the new query licence certificate
	 * @return the new query licence certificate
	 */
	public QueryLicenceCertificate create(long queryLicenceCertificateId);

	/**
	 * Removes the query licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate that was removed
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	public QueryLicenceCertificate remove(long queryLicenceCertificateId)
		throws NoSuchQueryLicenceCertificateException;

	public QueryLicenceCertificate updateImpl(
		QueryLicenceCertificate queryLicenceCertificate);

	/**
	 * Returns the query licence certificate with the primary key or throws a <code>NoSuchQueryLicenceCertificateException</code> if it could not be found.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	public QueryLicenceCertificate findByPrimaryKey(
			long queryLicenceCertificateId)
		throws NoSuchQueryLicenceCertificateException;

	/**
	 * Returns the query licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate, or <code>null</code> if a query licence certificate with the primary key could not be found
	 */
	public QueryLicenceCertificate fetchByPrimaryKey(
		long queryLicenceCertificateId);

	/**
	 * Returns all the query licence certificates.
	 *
	 * @return the query licence certificates
	 */
	public java.util.List<QueryLicenceCertificate> findAll();

	/**
	 * Returns a range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @return the range of query licence certificates
	 */
	public java.util.List<QueryLicenceCertificate> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of query licence certificates
	 */
	public java.util.List<QueryLicenceCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QueryLicenceCertificate> orderByComparator);

	/**
	 * Returns an ordered range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of query licence certificates
	 */
	public java.util.List<QueryLicenceCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QueryLicenceCertificate> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the query licence certificates from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of query licence certificates.
	 *
	 * @return the number of query licence certificates
	 */
	public int countAll();

}