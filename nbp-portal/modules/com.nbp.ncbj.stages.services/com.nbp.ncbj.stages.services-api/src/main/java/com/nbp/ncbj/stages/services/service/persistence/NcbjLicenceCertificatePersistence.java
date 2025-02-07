/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjLicenceCertificateException;
import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj licence certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificateUtil
 * @generated
 */
@ProviderType
public interface NcbjLicenceCertificatePersistence
	extends BasePersistence<NcbjLicenceCertificate> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjLicenceCertificateUtil} to access the ncbj licence certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or throws a <code>NoSuchNcbjLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	public NcbjLicenceCertificate findBygetNcbjLicenceCertiBy_CI(String caseId)
		throws NoSuchNcbjLicenceCertificateException;

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	public NcbjLicenceCertificate fetchBygetNcbjLicenceCertiBy_CI(
		String caseId);

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	public NcbjLicenceCertificate fetchBygetNcbjLicenceCertiBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncbj licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj licence certificate that was removed
	 */
	public NcbjLicenceCertificate removeBygetNcbjLicenceCertiBy_CI(
			String caseId)
		throws NoSuchNcbjLicenceCertificateException;

	/**
	 * Returns the number of ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj licence certificates
	 */
	public int countBygetNcbjLicenceCertiBy_CI(String caseId);

	/**
	 * Returns all the ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificates
	 */
	public java.util.List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId);

	/**
	 * Returns a range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of matching ncbj licence certificates
	 */
	public java.util.List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj licence certificates
	 */
	public java.util.List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjLicenceCertificate>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj licence certificates
	 */
	public java.util.List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjLicenceCertificate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	public NcbjLicenceCertificate findBygetNcbjLicCertiBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjLicenceCertificate> orderByComparator)
		throws NoSuchNcbjLicenceCertificateException;

	/**
	 * Returns the first ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	public NcbjLicenceCertificate fetchBygetNcbjLicCertiBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjLicenceCertificate>
			orderByComparator);

	/**
	 * Returns the last ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	public NcbjLicenceCertificate findBygetNcbjLicCertiBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjLicenceCertificate> orderByComparator)
		throws NoSuchNcbjLicenceCertificateException;

	/**
	 * Returns the last ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	public NcbjLicenceCertificate fetchBygetNcbjLicCertiBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjLicenceCertificate>
			orderByComparator);

	/**
	 * Returns the ncbj licence certificates before and after the current ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the current ncbj licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	public NcbjLicenceCertificate[] findBygetNcbjLicCertiBy_CI_PrevAndNext(
			long ncbjLicenceCertificateId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjLicenceCertificate> orderByComparator)
		throws NoSuchNcbjLicenceCertificateException;

	/**
	 * Removes all the ncbj licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetNcbjLicCertiBy_CI(String caseId);

	/**
	 * Returns the number of ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj licence certificates
	 */
	public int countBygetNcbjLicCertiBy_CI(String caseId);

	/**
	 * Caches the ncbj licence certificate in the entity cache if it is enabled.
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 */
	public void cacheResult(NcbjLicenceCertificate ncbjLicenceCertificate);

	/**
	 * Caches the ncbj licence certificates in the entity cache if it is enabled.
	 *
	 * @param ncbjLicenceCertificates the ncbj licence certificates
	 */
	public void cacheResult(
		java.util.List<NcbjLicenceCertificate> ncbjLicenceCertificates);

	/**
	 * Creates a new ncbj licence certificate with the primary key. Does not add the ncbj licence certificate to the database.
	 *
	 * @param ncbjLicenceCertificateId the primary key for the new ncbj licence certificate
	 * @return the new ncbj licence certificate
	 */
	public NcbjLicenceCertificate create(long ncbjLicenceCertificateId);

	/**
	 * Removes the ncbj licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	public NcbjLicenceCertificate remove(long ncbjLicenceCertificateId)
		throws NoSuchNcbjLicenceCertificateException;

	public NcbjLicenceCertificate updateImpl(
		NcbjLicenceCertificate ncbjLicenceCertificate);

	/**
	 * Returns the ncbj licence certificate with the primary key or throws a <code>NoSuchNcbjLicenceCertificateException</code> if it could not be found.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	public NcbjLicenceCertificate findByPrimaryKey(
			long ncbjLicenceCertificateId)
		throws NoSuchNcbjLicenceCertificateException;

	/**
	 * Returns the ncbj licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate, or <code>null</code> if a ncbj licence certificate with the primary key could not be found
	 */
	public NcbjLicenceCertificate fetchByPrimaryKey(
		long ncbjLicenceCertificateId);

	/**
	 * Returns all the ncbj licence certificates.
	 *
	 * @return the ncbj licence certificates
	 */
	public java.util.List<NcbjLicenceCertificate> findAll();

	/**
	 * Returns a range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of ncbj licence certificates
	 */
	public java.util.List<NcbjLicenceCertificate> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj licence certificates
	 */
	public java.util.List<NcbjLicenceCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjLicenceCertificate>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj licence certificates
	 */
	public java.util.List<NcbjLicenceCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjLicenceCertificate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj licence certificates from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj licence certificates.
	 *
	 * @return the number of ncbj licence certificates
	 */
	public int countAll();

}