/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchSourcesDetailAddException;
import com.nbp.hsra.application.service.model.SourcesDetailAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sources detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SourcesDetailAddUtil
 * @generated
 */
@ProviderType
public interface SourcesDetailAddPersistence
	extends BasePersistence<SourcesDetailAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SourcesDetailAddUtil} to access the sources detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching sources detail adds
	 */
	public java.util.List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @return the range of matching sources detail adds
	 */
	public java.util.List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sources detail adds
	 */
	public java.util.List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sources detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sources detail adds
	 */
	public java.util.List<SourcesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sources detail add
	 * @throws NoSuchSourcesDetailAddException if a matching sources detail add could not be found
	 */
	public SourcesDetailAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
				orderByComparator)
		throws NoSuchSourcesDetailAddException;

	/**
	 * Returns the first sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sources detail add, or <code>null</code> if a matching sources detail add could not be found
	 */
	public SourcesDetailAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
			orderByComparator);

	/**
	 * Returns the last sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sources detail add
	 * @throws NoSuchSourcesDetailAddException if a matching sources detail add could not be found
	 */
	public SourcesDetailAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
				orderByComparator)
		throws NoSuchSourcesDetailAddException;

	/**
	 * Returns the last sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sources detail add, or <code>null</code> if a matching sources detail add could not be found
	 */
	public SourcesDetailAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
			orderByComparator);

	/**
	 * Returns the sources detail adds before and after the current sources detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param sourcesDetailAddId the primary key of the current sources detail add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sources detail add
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	public SourcesDetailAdd[] findBygetHsraById_PrevAndNext(
			long sourcesDetailAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
				orderByComparator)
		throws NoSuchSourcesDetailAddException;

	/**
	 * Removes all the sources detail adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of sources detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching sources detail adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the sources detail add in the entity cache if it is enabled.
	 *
	 * @param sourcesDetailAdd the sources detail add
	 */
	public void cacheResult(SourcesDetailAdd sourcesDetailAdd);

	/**
	 * Caches the sources detail adds in the entity cache if it is enabled.
	 *
	 * @param sourcesDetailAdds the sources detail adds
	 */
	public void cacheResult(java.util.List<SourcesDetailAdd> sourcesDetailAdds);

	/**
	 * Creates a new sources detail add with the primary key. Does not add the sources detail add to the database.
	 *
	 * @param sourcesDetailAddId the primary key for the new sources detail add
	 * @return the new sources detail add
	 */
	public SourcesDetailAdd create(long sourcesDetailAddId);

	/**
	 * Removes the sources detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add that was removed
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	public SourcesDetailAdd remove(long sourcesDetailAddId)
		throws NoSuchSourcesDetailAddException;

	public SourcesDetailAdd updateImpl(SourcesDetailAdd sourcesDetailAdd);

	/**
	 * Returns the sources detail add with the primary key or throws a <code>NoSuchSourcesDetailAddException</code> if it could not be found.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add
	 * @throws NoSuchSourcesDetailAddException if a sources detail add with the primary key could not be found
	 */
	public SourcesDetailAdd findByPrimaryKey(long sourcesDetailAddId)
		throws NoSuchSourcesDetailAddException;

	/**
	 * Returns the sources detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add, or <code>null</code> if a sources detail add with the primary key could not be found
	 */
	public SourcesDetailAdd fetchByPrimaryKey(long sourcesDetailAddId);

	/**
	 * Returns all the sources detail adds.
	 *
	 * @return the sources detail adds
	 */
	public java.util.List<SourcesDetailAdd> findAll();

	/**
	 * Returns a range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @return the range of sources detail adds
	 */
	public java.util.List<SourcesDetailAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sources detail adds
	 */
	public java.util.List<SourcesDetailAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sources detail adds
	 */
	public java.util.List<SourcesDetailAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SourcesDetailAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sources detail adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sources detail adds.
	 *
	 * @return the number of sources detail adds
	 */
	public int countAll();

}