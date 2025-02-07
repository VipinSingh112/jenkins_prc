/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ogt.application.form.services.exception.NoSuchOgtInsolventPersonDetailException;
import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ogt insolvent person detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtInsolventPersonDetailUtil
 * @generated
 */
@ProviderType
public interface OgtInsolventPersonDetailPersistence
	extends BasePersistence<OgtInsolventPersonDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OgtInsolventPersonDetailUtil} to access the ogt insolvent person detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or throws a <code>NoSuchOgtInsolventPersonDetailException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt insolvent person detail
	 * @throws NoSuchOgtInsolventPersonDetailException if a matching ogt insolvent person detail could not be found
	 */
	public OgtInsolventPersonDetail findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtInsolventPersonDetailException;

	/**
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt insolvent person detail, or <code>null</code> if a matching ogt insolvent person detail could not be found
	 */
	public OgtInsolventPersonDetail fetchBygetOgtById(long ogtApplicationId);

	/**
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt insolvent person detail, or <code>null</code> if a matching ogt insolvent person detail could not be found
	 */
	public OgtInsolventPersonDetail fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache);

	/**
	 * Removes the ogt insolvent person detail where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt insolvent person detail that was removed
	 */
	public OgtInsolventPersonDetail removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtInsolventPersonDetailException;

	/**
	 * Returns the number of ogt insolvent person details where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt insolvent person details
	 */
	public int countBygetOgtById(long ogtApplicationId);

	/**
	 * Caches the ogt insolvent person detail in the entity cache if it is enabled.
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 */
	public void cacheResult(OgtInsolventPersonDetail ogtInsolventPersonDetail);

	/**
	 * Caches the ogt insolvent person details in the entity cache if it is enabled.
	 *
	 * @param ogtInsolventPersonDetails the ogt insolvent person details
	 */
	public void cacheResult(
		java.util.List<OgtInsolventPersonDetail> ogtInsolventPersonDetails);

	/**
	 * Creates a new ogt insolvent person detail with the primary key. Does not add the ogt insolvent person detail to the database.
	 *
	 * @param ogtInsolventPersonDetailId the primary key for the new ogt insolvent person detail
	 * @return the new ogt insolvent person detail
	 */
	public OgtInsolventPersonDetail create(long ogtInsolventPersonDetailId);

	/**
	 * Removes the ogt insolvent person detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was removed
	 * @throws NoSuchOgtInsolventPersonDetailException if a ogt insolvent person detail with the primary key could not be found
	 */
	public OgtInsolventPersonDetail remove(long ogtInsolventPersonDetailId)
		throws NoSuchOgtInsolventPersonDetailException;

	public OgtInsolventPersonDetail updateImpl(
		OgtInsolventPersonDetail ogtInsolventPersonDetail);

	/**
	 * Returns the ogt insolvent person detail with the primary key or throws a <code>NoSuchOgtInsolventPersonDetailException</code> if it could not be found.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail
	 * @throws NoSuchOgtInsolventPersonDetailException if a ogt insolvent person detail with the primary key could not be found
	 */
	public OgtInsolventPersonDetail findByPrimaryKey(
			long ogtInsolventPersonDetailId)
		throws NoSuchOgtInsolventPersonDetailException;

	/**
	 * Returns the ogt insolvent person detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail, or <code>null</code> if a ogt insolvent person detail with the primary key could not be found
	 */
	public OgtInsolventPersonDetail fetchByPrimaryKey(
		long ogtInsolventPersonDetailId);

	/**
	 * Returns all the ogt insolvent person details.
	 *
	 * @return the ogt insolvent person details
	 */
	public java.util.List<OgtInsolventPersonDetail> findAll();

	/**
	 * Returns a range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @return the range of ogt insolvent person details
	 */
	public java.util.List<OgtInsolventPersonDetail> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt insolvent person details
	 */
	public java.util.List<OgtInsolventPersonDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OgtInsolventPersonDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt insolvent person details
	 */
	public java.util.List<OgtInsolventPersonDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OgtInsolventPersonDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ogt insolvent person details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ogt insolvent person details.
	 *
	 * @return the number of ogt insolvent person details
	 */
	public int countAll();

}