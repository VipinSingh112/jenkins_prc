/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.stages.services.exception.NoSuchTourismDeskVerificationException;
import com.nbp.tourism.application.stages.services.model.TourismDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface TourismDeskVerificationPersistence
	extends BasePersistence<TourismDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismDeskVerificationUtil} to access the tourism desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism desk verifications
	 */
	public java.util.List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId);

	/**
	 * Returns a range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @return the range of matching tourism desk verifications
	 */
	public java.util.List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism desk verifications
	 */
	public java.util.List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism desk verifications
	 */
	public java.util.List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a matching tourism desk verification could not be found
	 */
	public TourismDeskVerification findBygetTourismDV_ById_First(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismDeskVerification> orderByComparator)
		throws NoSuchTourismDeskVerificationException;

	/**
	 * Returns the first tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism desk verification, or <code>null</code> if a matching tourism desk verification could not be found
	 */
	public TourismDeskVerification fetchBygetTourismDV_ById_First(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismDeskVerification> orderByComparator);

	/**
	 * Returns the last tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a matching tourism desk verification could not be found
	 */
	public TourismDeskVerification findBygetTourismDV_ById_Last(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismDeskVerification> orderByComparator)
		throws NoSuchTourismDeskVerificationException;

	/**
	 * Returns the last tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism desk verification, or <code>null</code> if a matching tourism desk verification could not be found
	 */
	public TourismDeskVerification fetchBygetTourismDV_ById_Last(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismDeskVerification> orderByComparator);

	/**
	 * Returns the tourism desk verifications before and after the current tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismDeskVeriId the primary key of the current tourism desk verification
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	public TourismDeskVerification[] findBygetTourismDV_ById_PrevAndNext(
			long tourismDeskVeriId, long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismDeskVerification> orderByComparator)
		throws NoSuchTourismDeskVerificationException;

	/**
	 * Removes all the tourism desk verifications where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public void removeBygetTourismDV_ById(long tourismApplicationId);

	/**
	 * Returns the number of tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism desk verifications
	 */
	public int countBygetTourismDV_ById(long tourismApplicationId);

	/**
	 * Caches the tourism desk verification in the entity cache if it is enabled.
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 */
	public void cacheResult(TourismDeskVerification tourismDeskVerification);

	/**
	 * Caches the tourism desk verifications in the entity cache if it is enabled.
	 *
	 * @param tourismDeskVerifications the tourism desk verifications
	 */
	public void cacheResult(
		java.util.List<TourismDeskVerification> tourismDeskVerifications);

	/**
	 * Creates a new tourism desk verification with the primary key. Does not add the tourism desk verification to the database.
	 *
	 * @param tourismDeskVeriId the primary key for the new tourism desk verification
	 * @return the new tourism desk verification
	 */
	public TourismDeskVerification create(long tourismDeskVeriId);

	/**
	 * Removes the tourism desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification that was removed
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	public TourismDeskVerification remove(long tourismDeskVeriId)
		throws NoSuchTourismDeskVerificationException;

	public TourismDeskVerification updateImpl(
		TourismDeskVerification tourismDeskVerification);

	/**
	 * Returns the tourism desk verification with the primary key or throws a <code>NoSuchTourismDeskVerificationException</code> if it could not be found.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	public TourismDeskVerification findByPrimaryKey(long tourismDeskVeriId)
		throws NoSuchTourismDeskVerificationException;

	/**
	 * Returns the tourism desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification, or <code>null</code> if a tourism desk verification with the primary key could not be found
	 */
	public TourismDeskVerification fetchByPrimaryKey(long tourismDeskVeriId);

	/**
	 * Returns all the tourism desk verifications.
	 *
	 * @return the tourism desk verifications
	 */
	public java.util.List<TourismDeskVerification> findAll();

	/**
	 * Returns a range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @return the range of tourism desk verifications
	 */
	public java.util.List<TourismDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism desk verifications
	 */
	public java.util.List<TourismDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism desk verifications
	 */
	public java.util.List<TourismDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism desk verifications.
	 *
	 * @return the number of tourism desk verifications
	 */
	public int countAll();

}