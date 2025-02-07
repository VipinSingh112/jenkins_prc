/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjCompanyDetailGenException;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj company detail gen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailGenUtil
 * @generated
 */
@ProviderType
public interface NcbjCompanyDetailGenPersistence
	extends BasePersistence<NcbjCompanyDetailGen> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjCompanyDetailGenUtil} to access the ncbj company detail gen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCompanyDetailGenException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	public NcbjCompanyDetailGen findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjCompanyDetailGenException;

	/**
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	public NcbjCompanyDetailGen fetchBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	public NcbjCompanyDetailGen fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj company detail gen where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company detail gen that was removed
	 */
	public NcbjCompanyDetailGen removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjCompanyDetailGenException;

	/**
	 * Returns the number of ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company detail gens
	 */
	public int countBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gens
	 */
	public java.util.List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @return the range of matching ncbj company detail gens
	 */
	public java.util.List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj company detail gens
	 */
	public java.util.List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCompanyDetailGen>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj company detail gens
	 */
	public java.util.List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCompanyDetailGen>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	public NcbjCompanyDetailGen findByget_NCBJ_ListBy_AppId_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjCompanyDetailGen> orderByComparator)
		throws NoSuchNcbjCompanyDetailGenException;

	/**
	 * Returns the first ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	public NcbjCompanyDetailGen fetchByget_NCBJ_ListBy_AppId_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCompanyDetailGen>
			orderByComparator);

	/**
	 * Returns the last ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	public NcbjCompanyDetailGen findByget_NCBJ_ListBy_AppId_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjCompanyDetailGen> orderByComparator)
		throws NoSuchNcbjCompanyDetailGenException;

	/**
	 * Returns the last ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	public NcbjCompanyDetailGen fetchByget_NCBJ_ListBy_AppId_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCompanyDetailGen>
			orderByComparator);

	/**
	 * Returns the ncbj company detail gens before and after the current ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the current ncbj company detail gen
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	public NcbjCompanyDetailGen[] findByget_NCBJ_ListBy_AppId_PrevAndNext(
			long ncbjCompanyDetailGenId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjCompanyDetailGen> orderByComparator)
		throws NoSuchNcbjCompanyDetailGenException;

	/**
	 * Removes all the ncbj company detail gens where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeByget_NCBJ_ListBy_AppId(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company detail gens
	 */
	public int countByget_NCBJ_ListBy_AppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj company detail gen in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 */
	public void cacheResult(NcbjCompanyDetailGen ncbjCompanyDetailGen);

	/**
	 * Caches the ncbj company detail gens in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailGens the ncbj company detail gens
	 */
	public void cacheResult(
		java.util.List<NcbjCompanyDetailGen> ncbjCompanyDetailGens);

	/**
	 * Creates a new ncbj company detail gen with the primary key. Does not add the ncbj company detail gen to the database.
	 *
	 * @param ncbjCompanyDetailGenId the primary key for the new ncbj company detail gen
	 * @return the new ncbj company detail gen
	 */
	public NcbjCompanyDetailGen create(long ncbjCompanyDetailGenId);

	/**
	 * Removes the ncbj company detail gen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen that was removed
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	public NcbjCompanyDetailGen remove(long ncbjCompanyDetailGenId)
		throws NoSuchNcbjCompanyDetailGenException;

	public NcbjCompanyDetailGen updateImpl(
		NcbjCompanyDetailGen ncbjCompanyDetailGen);

	/**
	 * Returns the ncbj company detail gen with the primary key or throws a <code>NoSuchNcbjCompanyDetailGenException</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	public NcbjCompanyDetailGen findByPrimaryKey(long ncbjCompanyDetailGenId)
		throws NoSuchNcbjCompanyDetailGenException;

	/**
	 * Returns the ncbj company detail gen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen, or <code>null</code> if a ncbj company detail gen with the primary key could not be found
	 */
	public NcbjCompanyDetailGen fetchByPrimaryKey(long ncbjCompanyDetailGenId);

	/**
	 * Returns all the ncbj company detail gens.
	 *
	 * @return the ncbj company detail gens
	 */
	public java.util.List<NcbjCompanyDetailGen> findAll();

	/**
	 * Returns a range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @return the range of ncbj company detail gens
	 */
	public java.util.List<NcbjCompanyDetailGen> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company detail gens
	 */
	public java.util.List<NcbjCompanyDetailGen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCompanyDetailGen>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company detail gens
	 */
	public java.util.List<NcbjCompanyDetailGen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCompanyDetailGen>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj company detail gens from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj company detail gens.
	 *
	 * @return the number of ncbj company detail gens
	 */
	public int countAll();

}