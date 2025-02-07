/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeCertificateException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCertificateUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeCertificatePersistence
	extends BasePersistence<FireBrigadeCertificate> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeCertificateUtil} to access the fire brigade certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or throws a <code>NoSuchFireBrigadeCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade certificate
	 * @throws NoSuchFireBrigadeCertificateException if a matching fire brigade certificate could not be found
	 */
	public FireBrigadeCertificate findBygetFireBrigadeCertificateByCaseId(
			String caseId)
		throws NoSuchFireBrigadeCertificateException;

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade certificate, or <code>null</code> if a matching fire brigade certificate could not be found
	 */
	public FireBrigadeCertificate fetchBygetFireBrigadeCertificateByCaseId(
		String caseId);

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade certificate, or <code>null</code> if a matching fire brigade certificate could not be found
	 */
	public FireBrigadeCertificate fetchBygetFireBrigadeCertificateByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the fire brigade certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade certificate that was removed
	 */
	public FireBrigadeCertificate removeBygetFireBrigadeCertificateByCaseId(
			String caseId)
		throws NoSuchFireBrigadeCertificateException;

	/**
	 * Returns the number of fire brigade certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade certificates
	 */
	public int countBygetFireBrigadeCertificateByCaseId(String caseId);

	/**
	 * Caches the fire brigade certificate in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 */
	public void cacheResult(FireBrigadeCertificate fireBrigadeCertificate);

	/**
	 * Caches the fire brigade certificates in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCertificates the fire brigade certificates
	 */
	public void cacheResult(
		java.util.List<FireBrigadeCertificate> fireBrigadeCertificates);

	/**
	 * Creates a new fire brigade certificate with the primary key. Does not add the fire brigade certificate to the database.
	 *
	 * @param fireBrigadeCertificateId the primary key for the new fire brigade certificate
	 * @return the new fire brigade certificate
	 */
	public FireBrigadeCertificate create(long fireBrigadeCertificateId);

	/**
	 * Removes the fire brigade certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate that was removed
	 * @throws NoSuchFireBrigadeCertificateException if a fire brigade certificate with the primary key could not be found
	 */
	public FireBrigadeCertificate remove(long fireBrigadeCertificateId)
		throws NoSuchFireBrigadeCertificateException;

	public FireBrigadeCertificate updateImpl(
		FireBrigadeCertificate fireBrigadeCertificate);

	/**
	 * Returns the fire brigade certificate with the primary key or throws a <code>NoSuchFireBrigadeCertificateException</code> if it could not be found.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate
	 * @throws NoSuchFireBrigadeCertificateException if a fire brigade certificate with the primary key could not be found
	 */
	public FireBrigadeCertificate findByPrimaryKey(
			long fireBrigadeCertificateId)
		throws NoSuchFireBrigadeCertificateException;

	/**
	 * Returns the fire brigade certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate, or <code>null</code> if a fire brigade certificate with the primary key could not be found
	 */
	public FireBrigadeCertificate fetchByPrimaryKey(
		long fireBrigadeCertificateId);

	/**
	 * Returns all the fire brigade certificates.
	 *
	 * @return the fire brigade certificates
	 */
	public java.util.List<FireBrigadeCertificate> findAll();

	/**
	 * Returns a range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @return the range of fire brigade certificates
	 */
	public java.util.List<FireBrigadeCertificate> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade certificates
	 */
	public java.util.List<FireBrigadeCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeCertificate>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade certificates
	 */
	public java.util.List<FireBrigadeCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeCertificate>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade certificates from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade certificates.
	 *
	 * @return the number of fire brigade certificates
	 */
	public int countAll();

}