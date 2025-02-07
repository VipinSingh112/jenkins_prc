/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNCBJCompanyNewException;
import com.nbp.ncbj.application.form.service.model.NCBJCompanyNew;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj company new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NCBJCompanyNewUtil
 * @generated
 */
@ProviderType
public interface NCBJCompanyNewPersistence
	extends BasePersistence<NCBJCompanyNew> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NCBJCompanyNewUtil} to access the ncbj company new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or throws a <code>NoSuchNCBJCompanyNewException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	public NCBJCompanyNew findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNCBJCompanyNewException;

	/**
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	public NCBJCompanyNew fetchBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	public NCBJCompanyNew fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj company new where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company new that was removed
	 */
	public NCBJCompanyNew removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNCBJCompanyNewException;

	/**
	 * Returns the number of ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company news
	 */
	public int countBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company news
	 */
	public java.util.List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @return the range of matching ncbj company news
	 */
	public java.util.List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj company news
	 */
	public java.util.List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj company news
	 */
	public java.util.List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	public NCBJCompanyNew findByget_NCBJ_ListBy_AppId_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
				orderByComparator)
		throws NoSuchNCBJCompanyNewException;

	/**
	 * Returns the first ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	public NCBJCompanyNew fetchByget_NCBJ_ListBy_AppId_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
			orderByComparator);

	/**
	 * Returns the last ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	public NCBJCompanyNew findByget_NCBJ_ListBy_AppId_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
				orderByComparator)
		throws NoSuchNCBJCompanyNewException;

	/**
	 * Returns the last ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	public NCBJCompanyNew fetchByget_NCBJ_ListBy_AppId_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
			orderByComparator);

	/**
	 * Returns the ncbj company news before and after the current ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param nCBJCompanyNewId the primary key of the current ncbj company new
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	public NCBJCompanyNew[] findByget_NCBJ_ListBy_AppId_PrevAndNext(
			long nCBJCompanyNewId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
				orderByComparator)
		throws NoSuchNCBJCompanyNewException;

	/**
	 * Removes all the ncbj company news where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeByget_NCBJ_ListBy_AppId(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company news
	 */
	public int countByget_NCBJ_ListBy_AppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj company new in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyNew the ncbj company new
	 */
	public void cacheResult(NCBJCompanyNew ncbjCompanyNew);

	/**
	 * Caches the ncbj company news in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyNews the ncbj company news
	 */
	public void cacheResult(java.util.List<NCBJCompanyNew> ncbjCompanyNews);

	/**
	 * Creates a new ncbj company new with the primary key. Does not add the ncbj company new to the database.
	 *
	 * @param nCBJCompanyNewId the primary key for the new ncbj company new
	 * @return the new ncbj company new
	 */
	public NCBJCompanyNew create(long nCBJCompanyNewId);

	/**
	 * Removes the ncbj company new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new that was removed
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	public NCBJCompanyNew remove(long nCBJCompanyNewId)
		throws NoSuchNCBJCompanyNewException;

	public NCBJCompanyNew updateImpl(NCBJCompanyNew ncbjCompanyNew);

	/**
	 * Returns the ncbj company new with the primary key or throws a <code>NoSuchNCBJCompanyNewException</code> if it could not be found.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	public NCBJCompanyNew findByPrimaryKey(long nCBJCompanyNewId)
		throws NoSuchNCBJCompanyNewException;

	/**
	 * Returns the ncbj company new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new, or <code>null</code> if a ncbj company new with the primary key could not be found
	 */
	public NCBJCompanyNew fetchByPrimaryKey(long nCBJCompanyNewId);

	/**
	 * Returns all the ncbj company news.
	 *
	 * @return the ncbj company news
	 */
	public java.util.List<NCBJCompanyNew> findAll();

	/**
	 * Returns a range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @return the range of ncbj company news
	 */
	public java.util.List<NCBJCompanyNew> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company news
	 */
	public java.util.List<NCBJCompanyNew> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company news
	 */
	public java.util.List<NCBJCompanyNew> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NCBJCompanyNew>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj company news from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj company news.
	 *
	 * @return the number of ncbj company news
	 */
	public int countAll();

}