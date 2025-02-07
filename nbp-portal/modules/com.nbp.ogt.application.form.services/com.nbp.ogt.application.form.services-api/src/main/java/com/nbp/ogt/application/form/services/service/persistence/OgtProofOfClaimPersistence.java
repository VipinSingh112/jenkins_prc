/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ogt.application.form.services.exception.NoSuchOgtProofOfClaimException;
import com.nbp.ogt.application.form.services.model.OgtProofOfClaim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ogt proof of claim service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtProofOfClaimUtil
 * @generated
 */
@ProviderType
public interface OgtProofOfClaimPersistence
	extends BasePersistence<OgtProofOfClaim> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OgtProofOfClaimUtil} to access the ogt proof of claim persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ogt proof of claim where ogtApplicationId = &#63; or throws a <code>NoSuchOgtProofOfClaimException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt proof of claim
	 * @throws NoSuchOgtProofOfClaimException if a matching ogt proof of claim could not be found
	 */
	public OgtProofOfClaim findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtProofOfClaimException;

	/**
	 * Returns the ogt proof of claim where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt proof of claim, or <code>null</code> if a matching ogt proof of claim could not be found
	 */
	public OgtProofOfClaim fetchBygetOgtById(long ogtApplicationId);

	/**
	 * Returns the ogt proof of claim where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt proof of claim, or <code>null</code> if a matching ogt proof of claim could not be found
	 */
	public OgtProofOfClaim fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache);

	/**
	 * Removes the ogt proof of claim where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt proof of claim that was removed
	 */
	public OgtProofOfClaim removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtProofOfClaimException;

	/**
	 * Returns the number of ogt proof of claims where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt proof of claims
	 */
	public int countBygetOgtById(long ogtApplicationId);

	/**
	 * Caches the ogt proof of claim in the entity cache if it is enabled.
	 *
	 * @param ogtProofOfClaim the ogt proof of claim
	 */
	public void cacheResult(OgtProofOfClaim ogtProofOfClaim);

	/**
	 * Caches the ogt proof of claims in the entity cache if it is enabled.
	 *
	 * @param ogtProofOfClaims the ogt proof of claims
	 */
	public void cacheResult(java.util.List<OgtProofOfClaim> ogtProofOfClaims);

	/**
	 * Creates a new ogt proof of claim with the primary key. Does not add the ogt proof of claim to the database.
	 *
	 * @param ogtProofOfClaimId the primary key for the new ogt proof of claim
	 * @return the new ogt proof of claim
	 */
	public OgtProofOfClaim create(long ogtProofOfClaimId);

	/**
	 * Removes the ogt proof of claim with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim that was removed
	 * @throws NoSuchOgtProofOfClaimException if a ogt proof of claim with the primary key could not be found
	 */
	public OgtProofOfClaim remove(long ogtProofOfClaimId)
		throws NoSuchOgtProofOfClaimException;

	public OgtProofOfClaim updateImpl(OgtProofOfClaim ogtProofOfClaim);

	/**
	 * Returns the ogt proof of claim with the primary key or throws a <code>NoSuchOgtProofOfClaimException</code> if it could not be found.
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim
	 * @throws NoSuchOgtProofOfClaimException if a ogt proof of claim with the primary key could not be found
	 */
	public OgtProofOfClaim findByPrimaryKey(long ogtProofOfClaimId)
		throws NoSuchOgtProofOfClaimException;

	/**
	 * Returns the ogt proof of claim with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim, or <code>null</code> if a ogt proof of claim with the primary key could not be found
	 */
	public OgtProofOfClaim fetchByPrimaryKey(long ogtProofOfClaimId);

	/**
	 * Returns all the ogt proof of claims.
	 *
	 * @return the ogt proof of claims
	 */
	public java.util.List<OgtProofOfClaim> findAll();

	/**
	 * Returns a range of all the ogt proof of claims.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtProofOfClaimModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt proof of claims
	 * @param end the upper bound of the range of ogt proof of claims (not inclusive)
	 * @return the range of ogt proof of claims
	 */
	public java.util.List<OgtProofOfClaim> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ogt proof of claims.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtProofOfClaimModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt proof of claims
	 * @param end the upper bound of the range of ogt proof of claims (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt proof of claims
	 */
	public java.util.List<OgtProofOfClaim> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtProofOfClaim>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt proof of claims.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtProofOfClaimModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt proof of claims
	 * @param end the upper bound of the range of ogt proof of claims (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt proof of claims
	 */
	public java.util.List<OgtProofOfClaim> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtProofOfClaim>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ogt proof of claims from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ogt proof of claims.
	 *
	 * @return the number of ogt proof of claims
	 */
	public int countAll();

}