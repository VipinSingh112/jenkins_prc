/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuInternationalCertificateException;
import com.nbp.manufacturing.application.form.service.model.ManuInternationalCertificate;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu international certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuInternationalCertificateUtil
 * @generated
 */
@ProviderType
public interface ManuInternationalCertificatePersistence
	extends BasePersistence<ManuInternationalCertificate> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuInternationalCertificateUtil} to access the manu international certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuInternationalCertificateException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	public ManuInternationalCertificate findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuInternationalCertificateException;

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	public ManuInternationalCertificate fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	public ManuInternationalCertificate fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu international certificate where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu international certificate that was removed
	 */
	public ManuInternationalCertificate removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuInternationalCertificateException;

	/**
	 * Returns the number of manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu international certificates
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificates
	 */
	public java.util.List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @return the range of matching manu international certificates
	 */
	public java.util.List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu international certificates
	 */
	public java.util.List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuInternationalCertificate> orderByComparator);

	/**
	 * Returns an ordered range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu international certificates
	 */
	public java.util.List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuInternationalCertificate> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	public ManuInternationalCertificate findBygetMA_IC_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuInternationalCertificate> orderByComparator)
		throws NoSuchManuInternationalCertificateException;

	/**
	 * Returns the first manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	public ManuInternationalCertificate fetchBygetMA_IC_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuInternationalCertificate> orderByComparator);

	/**
	 * Returns the last manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	public ManuInternationalCertificate findBygetMA_IC_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuInternationalCertificate> orderByComparator)
		throws NoSuchManuInternationalCertificateException;

	/**
	 * Returns the last manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	public ManuInternationalCertificate fetchBygetMA_IC_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuInternationalCertificate> orderByComparator);

	/**
	 * Returns the manu international certificates before and after the current manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuInternationalCertificateId the primary key of the current manu international certificate
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	public ManuInternationalCertificate[] findBygetMA_IC_MAI_PrevAndNext(
			long manuInternationalCertificateId,
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuInternationalCertificate> orderByComparator)
		throws NoSuchManuInternationalCertificateException;

	/**
	 * Removes all the manu international certificates where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_IC_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu international certificates
	 */
	public int countBygetMA_IC_MAI(long manufacturingApplicationId);

	/**
	 * Caches the manu international certificate in the entity cache if it is enabled.
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 */
	public void cacheResult(
		ManuInternationalCertificate manuInternationalCertificate);

	/**
	 * Caches the manu international certificates in the entity cache if it is enabled.
	 *
	 * @param manuInternationalCertificates the manu international certificates
	 */
	public void cacheResult(
		java.util.List<ManuInternationalCertificate>
			manuInternationalCertificates);

	/**
	 * Creates a new manu international certificate with the primary key. Does not add the manu international certificate to the database.
	 *
	 * @param manuInternationalCertificateId the primary key for the new manu international certificate
	 * @return the new manu international certificate
	 */
	public ManuInternationalCertificate create(
		long manuInternationalCertificateId);

	/**
	 * Removes the manu international certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate that was removed
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	public ManuInternationalCertificate remove(
			long manuInternationalCertificateId)
		throws NoSuchManuInternationalCertificateException;

	public ManuInternationalCertificate updateImpl(
		ManuInternationalCertificate manuInternationalCertificate);

	/**
	 * Returns the manu international certificate with the primary key or throws a <code>NoSuchManuInternationalCertificateException</code> if it could not be found.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	public ManuInternationalCertificate findByPrimaryKey(
			long manuInternationalCertificateId)
		throws NoSuchManuInternationalCertificateException;

	/**
	 * Returns the manu international certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate, or <code>null</code> if a manu international certificate with the primary key could not be found
	 */
	public ManuInternationalCertificate fetchByPrimaryKey(
		long manuInternationalCertificateId);

	/**
	 * Returns all the manu international certificates.
	 *
	 * @return the manu international certificates
	 */
	public java.util.List<ManuInternationalCertificate> findAll();

	/**
	 * Returns a range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @return the range of manu international certificates
	 */
	public java.util.List<ManuInternationalCertificate> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu international certificates
	 */
	public java.util.List<ManuInternationalCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuInternationalCertificate> orderByComparator);

	/**
	 * Returns an ordered range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu international certificates
	 */
	public java.util.List<ManuInternationalCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuInternationalCertificate> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu international certificates from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu international certificates.
	 *
	 * @return the number of manu international certificates
	 */
	public int countAll();

}