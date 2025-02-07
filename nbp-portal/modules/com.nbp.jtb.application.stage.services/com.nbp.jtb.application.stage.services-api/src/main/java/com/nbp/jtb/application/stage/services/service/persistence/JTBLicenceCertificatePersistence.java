/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.stage.services.exception.NoSuchJTBLicenceCertificateException;
import com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb licence certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBLicenceCertificateUtil
 * @generated
 */
@ProviderType
public interface JTBLicenceCertificatePersistence
	extends BasePersistence<JTBLicenceCertificate> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JTBLicenceCertificateUtil} to access the jtb licence certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or throws a <code>NoSuchJTBLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	public JTBLicenceCertificate findBygetJtbLicenceCertiBy_CI(String caseId)
		throws NoSuchJTBLicenceCertificateException;

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	public JTBLicenceCertificate fetchBygetJtbLicenceCertiBy_CI(String caseId);

	/**
	 * Returns the jtb licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	public JTBLicenceCertificate fetchBygetJtbLicenceCertiBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jtb licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb licence certificate that was removed
	 */
	public JTBLicenceCertificate removeBygetJtbLicenceCertiBy_CI(String caseId)
		throws NoSuchJTBLicenceCertificateException;

	/**
	 * Returns the number of jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb licence certificates
	 */
	public int countBygetJtbLicenceCertiBy_CI(String caseId);

	/**
	 * Returns all the jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb licence certificates
	 */
	public java.util.List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId);

	/**
	 * Returns a range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @return the range of matching jtb licence certificates
	 */
	public java.util.List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb licence certificates
	 */
	public java.util.List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBLicenceCertificate>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb licence certificates
	 */
	public java.util.List<JTBLicenceCertificate> findBygetJtbLicCertiBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBLicenceCertificate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	public JTBLicenceCertificate findBygetJtbLicCertiBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JTBLicenceCertificate> orderByComparator)
		throws NoSuchJTBLicenceCertificateException;

	/**
	 * Returns the first jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	public JTBLicenceCertificate fetchBygetJtbLicCertiBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JTBLicenceCertificate>
			orderByComparator);

	/**
	 * Returns the last jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a matching jtb licence certificate could not be found
	 */
	public JTBLicenceCertificate findBygetJtbLicCertiBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JTBLicenceCertificate> orderByComparator)
		throws NoSuchJTBLicenceCertificateException;

	/**
	 * Returns the last jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb licence certificate, or <code>null</code> if a matching jtb licence certificate could not be found
	 */
	public JTBLicenceCertificate fetchBygetJtbLicCertiBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JTBLicenceCertificate>
			orderByComparator);

	/**
	 * Returns the jtb licence certificates before and after the current jtb licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param jTBLicenceCertificateId the primary key of the current jtb licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	public JTBLicenceCertificate[] findBygetJtbLicCertiBy_CI_PrevAndNext(
			long jTBLicenceCertificateId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JTBLicenceCertificate> orderByComparator)
		throws NoSuchJTBLicenceCertificateException;

	/**
	 * Removes all the jtb licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetJtbLicCertiBy_CI(String caseId);

	/**
	 * Returns the number of jtb licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb licence certificates
	 */
	public int countBygetJtbLicCertiBy_CI(String caseId);

	/**
	 * Caches the jtb licence certificate in the entity cache if it is enabled.
	 *
	 * @param jtbLicenceCertificate the jtb licence certificate
	 */
	public void cacheResult(JTBLicenceCertificate jtbLicenceCertificate);

	/**
	 * Caches the jtb licence certificates in the entity cache if it is enabled.
	 *
	 * @param jtbLicenceCertificates the jtb licence certificates
	 */
	public void cacheResult(
		java.util.List<JTBLicenceCertificate> jtbLicenceCertificates);

	/**
	 * Creates a new jtb licence certificate with the primary key. Does not add the jtb licence certificate to the database.
	 *
	 * @param jTBLicenceCertificateId the primary key for the new jtb licence certificate
	 * @return the new jtb licence certificate
	 */
	public JTBLicenceCertificate create(long jTBLicenceCertificateId);

	/**
	 * Removes the jtb licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate that was removed
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	public JTBLicenceCertificate remove(long jTBLicenceCertificateId)
		throws NoSuchJTBLicenceCertificateException;

	public JTBLicenceCertificate updateImpl(
		JTBLicenceCertificate jtbLicenceCertificate);

	/**
	 * Returns the jtb licence certificate with the primary key or throws a <code>NoSuchJTBLicenceCertificateException</code> if it could not be found.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate
	 * @throws NoSuchJTBLicenceCertificateException if a jtb licence certificate with the primary key could not be found
	 */
	public JTBLicenceCertificate findByPrimaryKey(long jTBLicenceCertificateId)
		throws NoSuchJTBLicenceCertificateException;

	/**
	 * Returns the jtb licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBLicenceCertificateId the primary key of the jtb licence certificate
	 * @return the jtb licence certificate, or <code>null</code> if a jtb licence certificate with the primary key could not be found
	 */
	public JTBLicenceCertificate fetchByPrimaryKey(
		long jTBLicenceCertificateId);

	/**
	 * Returns all the jtb licence certificates.
	 *
	 * @return the jtb licence certificates
	 */
	public java.util.List<JTBLicenceCertificate> findAll();

	/**
	 * Returns a range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @return the range of jtb licence certificates
	 */
	public java.util.List<JTBLicenceCertificate> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb licence certificates
	 */
	public java.util.List<JTBLicenceCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBLicenceCertificate>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb licence certificates
	 * @param end the upper bound of the range of jtb licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb licence certificates
	 */
	public java.util.List<JTBLicenceCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBLicenceCertificate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb licence certificates from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb licence certificates.
	 *
	 * @return the number of jtb licence certificates
	 */
	public int countAll();

}