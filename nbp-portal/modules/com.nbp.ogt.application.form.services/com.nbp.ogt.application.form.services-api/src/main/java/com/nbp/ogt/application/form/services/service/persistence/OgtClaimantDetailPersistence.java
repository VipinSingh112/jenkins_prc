/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ogt.application.form.services.exception.NoSuchOgtClaimantDetailException;
import com.nbp.ogt.application.form.services.model.OgtClaimantDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ogt claimant detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimantDetailUtil
 * @generated
 */
@ProviderType
public interface OgtClaimantDetailPersistence
	extends BasePersistence<OgtClaimantDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OgtClaimantDetailUtil} to access the ogt claimant detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ogt claimant detail where ogtApplicationId = &#63; or throws a <code>NoSuchOgtClaimantDetailException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claimant detail
	 * @throws NoSuchOgtClaimantDetailException if a matching ogt claimant detail could not be found
	 */
	public OgtClaimantDetail findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtClaimantDetailException;

	/**
	 * Returns the ogt claimant detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claimant detail, or <code>null</code> if a matching ogt claimant detail could not be found
	 */
	public OgtClaimantDetail fetchBygetOgtById(long ogtApplicationId);

	/**
	 * Returns the ogt claimant detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt claimant detail, or <code>null</code> if a matching ogt claimant detail could not be found
	 */
	public OgtClaimantDetail fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache);

	/**
	 * Removes the ogt claimant detail where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt claimant detail that was removed
	 */
	public OgtClaimantDetail removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtClaimantDetailException;

	/**
	 * Returns the number of ogt claimant details where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt claimant details
	 */
	public int countBygetOgtById(long ogtApplicationId);

	/**
	 * Caches the ogt claimant detail in the entity cache if it is enabled.
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 */
	public void cacheResult(OgtClaimantDetail ogtClaimantDetail);

	/**
	 * Caches the ogt claimant details in the entity cache if it is enabled.
	 *
	 * @param ogtClaimantDetails the ogt claimant details
	 */
	public void cacheResult(
		java.util.List<OgtClaimantDetail> ogtClaimantDetails);

	/**
	 * Creates a new ogt claimant detail with the primary key. Does not add the ogt claimant detail to the database.
	 *
	 * @param ogtClaimantDetailId the primary key for the new ogt claimant detail
	 * @return the new ogt claimant detail
	 */
	public OgtClaimantDetail create(long ogtClaimantDetailId);

	/**
	 * Removes the ogt claimant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 * @throws NoSuchOgtClaimantDetailException if a ogt claimant detail with the primary key could not be found
	 */
	public OgtClaimantDetail remove(long ogtClaimantDetailId)
		throws NoSuchOgtClaimantDetailException;

	public OgtClaimantDetail updateImpl(OgtClaimantDetail ogtClaimantDetail);

	/**
	 * Returns the ogt claimant detail with the primary key or throws a <code>NoSuchOgtClaimantDetailException</code> if it could not be found.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail
	 * @throws NoSuchOgtClaimantDetailException if a ogt claimant detail with the primary key could not be found
	 */
	public OgtClaimantDetail findByPrimaryKey(long ogtClaimantDetailId)
		throws NoSuchOgtClaimantDetailException;

	/**
	 * Returns the ogt claimant detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail, or <code>null</code> if a ogt claimant detail with the primary key could not be found
	 */
	public OgtClaimantDetail fetchByPrimaryKey(long ogtClaimantDetailId);

	/**
	 * Returns all the ogt claimant details.
	 *
	 * @return the ogt claimant details
	 */
	public java.util.List<OgtClaimantDetail> findAll();

	/**
	 * Returns a range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @return the range of ogt claimant details
	 */
	public java.util.List<OgtClaimantDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt claimant details
	 */
	public java.util.List<OgtClaimantDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtClaimantDetail>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt claimant details
	 */
	public java.util.List<OgtClaimantDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtClaimantDetail>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ogt claimant details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ogt claimant details.
	 *
	 * @return the number of ogt claimant details
	 */
	public int countAll();

}