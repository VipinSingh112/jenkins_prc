/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireDraftAgreementException;
import com.nbp.acquire.stages.service.model.AcquireDraftAgreement;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire draft agreement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDraftAgreementUtil
 * @generated
 */
@ProviderType
public interface AcquireDraftAgreementPersistence
	extends BasePersistence<AcquireDraftAgreement> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireDraftAgreementUtil} to access the acquire draft agreement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or throws a <code>NoSuchAcquireDraftAgreementException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire draft agreement
	 * @throws NoSuchAcquireDraftAgreementException if a matching acquire draft agreement could not be found
	 */
	public AcquireDraftAgreement findBygetAcquire_DA_By_CI(String caseId)
		throws NoSuchAcquireDraftAgreementException;

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire draft agreement, or <code>null</code> if a matching acquire draft agreement could not be found
	 */
	public AcquireDraftAgreement fetchBygetAcquire_DA_By_CI(String caseId);

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire draft agreement, or <code>null</code> if a matching acquire draft agreement could not be found
	 */
	public AcquireDraftAgreement fetchBygetAcquire_DA_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire draft agreement where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire draft agreement that was removed
	 */
	public AcquireDraftAgreement removeBygetAcquire_DA_By_CI(String caseId)
		throws NoSuchAcquireDraftAgreementException;

	/**
	 * Returns the number of acquire draft agreements where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire draft agreements
	 */
	public int countBygetAcquire_DA_By_CI(String caseId);

	/**
	 * Caches the acquire draft agreement in the entity cache if it is enabled.
	 *
	 * @param acquireDraftAgreement the acquire draft agreement
	 */
	public void cacheResult(AcquireDraftAgreement acquireDraftAgreement);

	/**
	 * Caches the acquire draft agreements in the entity cache if it is enabled.
	 *
	 * @param acquireDraftAgreements the acquire draft agreements
	 */
	public void cacheResult(
		java.util.List<AcquireDraftAgreement> acquireDraftAgreements);

	/**
	 * Creates a new acquire draft agreement with the primary key. Does not add the acquire draft agreement to the database.
	 *
	 * @param acquireDraftId the primary key for the new acquire draft agreement
	 * @return the new acquire draft agreement
	 */
	public AcquireDraftAgreement create(long acquireDraftId);

	/**
	 * Removes the acquire draft agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement that was removed
	 * @throws NoSuchAcquireDraftAgreementException if a acquire draft agreement with the primary key could not be found
	 */
	public AcquireDraftAgreement remove(long acquireDraftId)
		throws NoSuchAcquireDraftAgreementException;

	public AcquireDraftAgreement updateImpl(
		AcquireDraftAgreement acquireDraftAgreement);

	/**
	 * Returns the acquire draft agreement with the primary key or throws a <code>NoSuchAcquireDraftAgreementException</code> if it could not be found.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement
	 * @throws NoSuchAcquireDraftAgreementException if a acquire draft agreement with the primary key could not be found
	 */
	public AcquireDraftAgreement findByPrimaryKey(long acquireDraftId)
		throws NoSuchAcquireDraftAgreementException;

	/**
	 * Returns the acquire draft agreement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement, or <code>null</code> if a acquire draft agreement with the primary key could not be found
	 */
	public AcquireDraftAgreement fetchByPrimaryKey(long acquireDraftId);

	/**
	 * Returns all the acquire draft agreements.
	 *
	 * @return the acquire draft agreements
	 */
	public java.util.List<AcquireDraftAgreement> findAll();

	/**
	 * Returns a range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @return the range of acquire draft agreements
	 */
	public java.util.List<AcquireDraftAgreement> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire draft agreements
	 */
	public java.util.List<AcquireDraftAgreement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDraftAgreement>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire draft agreements
	 */
	public java.util.List<AcquireDraftAgreement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDraftAgreement>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire draft agreements from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire draft agreements.
	 *
	 * @return the number of acquire draft agreements
	 */
	public int countAll();

}