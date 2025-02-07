/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireFinalExecutedAgreementException;
import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire final executed agreement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreementUtil
 * @generated
 */
@ProviderType
public interface AcquireFinalExecutedAgreementPersistence
	extends BasePersistence<AcquireFinalExecutedAgreement> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireFinalExecutedAgreementUtil} to access the acquire final executed agreement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or throws a <code>NoSuchAcquireFinalExecutedAgreementException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire final executed agreement
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a matching acquire final executed agreement could not be found
	 */
	public AcquireFinalExecutedAgreement findBygetAcquire_FEA_By_CI(
			String caseId)
		throws NoSuchAcquireFinalExecutedAgreementException;

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire final executed agreement, or <code>null</code> if a matching acquire final executed agreement could not be found
	 */
	public AcquireFinalExecutedAgreement fetchBygetAcquire_FEA_By_CI(
		String caseId);

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire final executed agreement, or <code>null</code> if a matching acquire final executed agreement could not be found
	 */
	public AcquireFinalExecutedAgreement fetchBygetAcquire_FEA_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire final executed agreement where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire final executed agreement that was removed
	 */
	public AcquireFinalExecutedAgreement removeBygetAcquire_FEA_By_CI(
			String caseId)
		throws NoSuchAcquireFinalExecutedAgreementException;

	/**
	 * Returns the number of acquire final executed agreements where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire final executed agreements
	 */
	public int countBygetAcquire_FEA_By_CI(String caseId);

	/**
	 * Caches the acquire final executed agreement in the entity cache if it is enabled.
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 */
	public void cacheResult(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement);

	/**
	 * Caches the acquire final executed agreements in the entity cache if it is enabled.
	 *
	 * @param acquireFinalExecutedAgreements the acquire final executed agreements
	 */
	public void cacheResult(
		java.util.List<AcquireFinalExecutedAgreement>
			acquireFinalExecutedAgreements);

	/**
	 * Creates a new acquire final executed agreement with the primary key. Does not add the acquire final executed agreement to the database.
	 *
	 * @param acquirefinalId the primary key for the new acquire final executed agreement
	 * @return the new acquire final executed agreement
	 */
	public AcquireFinalExecutedAgreement create(long acquirefinalId);

	/**
	 * Removes the acquire final executed agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement that was removed
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a acquire final executed agreement with the primary key could not be found
	 */
	public AcquireFinalExecutedAgreement remove(long acquirefinalId)
		throws NoSuchAcquireFinalExecutedAgreementException;

	public AcquireFinalExecutedAgreement updateImpl(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement);

	/**
	 * Returns the acquire final executed agreement with the primary key or throws a <code>NoSuchAcquireFinalExecutedAgreementException</code> if it could not be found.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a acquire final executed agreement with the primary key could not be found
	 */
	public AcquireFinalExecutedAgreement findByPrimaryKey(long acquirefinalId)
		throws NoSuchAcquireFinalExecutedAgreementException;

	/**
	 * Returns the acquire final executed agreement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement, or <code>null</code> if a acquire final executed agreement with the primary key could not be found
	 */
	public AcquireFinalExecutedAgreement fetchByPrimaryKey(long acquirefinalId);

	/**
	 * Returns all the acquire final executed agreements.
	 *
	 * @return the acquire final executed agreements
	 */
	public java.util.List<AcquireFinalExecutedAgreement> findAll();

	/**
	 * Returns a range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @return the range of acquire final executed agreements
	 */
	public java.util.List<AcquireFinalExecutedAgreement> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire final executed agreements
	 */
	public java.util.List<AcquireFinalExecutedAgreement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireFinalExecutedAgreement> orderByComparator);

	/**
	 * Returns an ordered range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire final executed agreements
	 */
	public java.util.List<AcquireFinalExecutedAgreement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireFinalExecutedAgreement> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire final executed agreements from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire final executed agreements.
	 *
	 * @return the number of acquire final executed agreements
	 */
	public int countAll();

}