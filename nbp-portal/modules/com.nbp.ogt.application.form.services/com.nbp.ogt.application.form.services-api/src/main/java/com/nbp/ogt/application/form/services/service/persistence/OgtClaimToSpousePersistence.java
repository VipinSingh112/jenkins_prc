/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ogt.application.form.services.exception.NoSuchOgtClaimToSpouseException;
import com.nbp.ogt.application.form.services.model.OgtClaimToSpouse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ogt claim to spouse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToSpouseUtil
 * @generated
 */
@ProviderType
public interface OgtClaimToSpousePersistence
	extends BasePersistence<OgtClaimToSpouse> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OgtClaimToSpouseUtil} to access the ogt claim to spouse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ogt claim to spouse where ogtApplicationId = &#63; or throws a <code>NoSuchOgtClaimToSpouseException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claim to spouse
	 * @throws NoSuchOgtClaimToSpouseException if a matching ogt claim to spouse could not be found
	 */
	public OgtClaimToSpouse findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtClaimToSpouseException;

	/**
	 * Returns the ogt claim to spouse where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claim to spouse, or <code>null</code> if a matching ogt claim to spouse could not be found
	 */
	public OgtClaimToSpouse fetchBygetOgtById(long ogtApplicationId);

	/**
	 * Returns the ogt claim to spouse where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt claim to spouse, or <code>null</code> if a matching ogt claim to spouse could not be found
	 */
	public OgtClaimToSpouse fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache);

	/**
	 * Removes the ogt claim to spouse where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt claim to spouse that was removed
	 */
	public OgtClaimToSpouse removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtClaimToSpouseException;

	/**
	 * Returns the number of ogt claim to spouses where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt claim to spouses
	 */
	public int countBygetOgtById(long ogtApplicationId);

	/**
	 * Caches the ogt claim to spouse in the entity cache if it is enabled.
	 *
	 * @param ogtClaimToSpouse the ogt claim to spouse
	 */
	public void cacheResult(OgtClaimToSpouse ogtClaimToSpouse);

	/**
	 * Caches the ogt claim to spouses in the entity cache if it is enabled.
	 *
	 * @param ogtClaimToSpouses the ogt claim to spouses
	 */
	public void cacheResult(java.util.List<OgtClaimToSpouse> ogtClaimToSpouses);

	/**
	 * Creates a new ogt claim to spouse with the primary key. Does not add the ogt claim to spouse to the database.
	 *
	 * @param ogtClaimToSpouseId the primary key for the new ogt claim to spouse
	 * @return the new ogt claim to spouse
	 */
	public OgtClaimToSpouse create(long ogtClaimToSpouseId);

	/**
	 * Removes the ogt claim to spouse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse that was removed
	 * @throws NoSuchOgtClaimToSpouseException if a ogt claim to spouse with the primary key could not be found
	 */
	public OgtClaimToSpouse remove(long ogtClaimToSpouseId)
		throws NoSuchOgtClaimToSpouseException;

	public OgtClaimToSpouse updateImpl(OgtClaimToSpouse ogtClaimToSpouse);

	/**
	 * Returns the ogt claim to spouse with the primary key or throws a <code>NoSuchOgtClaimToSpouseException</code> if it could not be found.
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse
	 * @throws NoSuchOgtClaimToSpouseException if a ogt claim to spouse with the primary key could not be found
	 */
	public OgtClaimToSpouse findByPrimaryKey(long ogtClaimToSpouseId)
		throws NoSuchOgtClaimToSpouseException;

	/**
	 * Returns the ogt claim to spouse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse, or <code>null</code> if a ogt claim to spouse with the primary key could not be found
	 */
	public OgtClaimToSpouse fetchByPrimaryKey(long ogtClaimToSpouseId);

	/**
	 * Returns all the ogt claim to spouses.
	 *
	 * @return the ogt claim to spouses
	 */
	public java.util.List<OgtClaimToSpouse> findAll();

	/**
	 * Returns a range of all the ogt claim to spouses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToSpouseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to spouses
	 * @param end the upper bound of the range of ogt claim to spouses (not inclusive)
	 * @return the range of ogt claim to spouses
	 */
	public java.util.List<OgtClaimToSpouse> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ogt claim to spouses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToSpouseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to spouses
	 * @param end the upper bound of the range of ogt claim to spouses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt claim to spouses
	 */
	public java.util.List<OgtClaimToSpouse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtClaimToSpouse>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt claim to spouses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToSpouseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to spouses
	 * @param end the upper bound of the range of ogt claim to spouses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt claim to spouses
	 */
	public java.util.List<OgtClaimToSpouse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtClaimToSpouse>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ogt claim to spouses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ogt claim to spouses.
	 *
	 * @return the number of ogt claim to spouses
	 */
	public int countAll();

}