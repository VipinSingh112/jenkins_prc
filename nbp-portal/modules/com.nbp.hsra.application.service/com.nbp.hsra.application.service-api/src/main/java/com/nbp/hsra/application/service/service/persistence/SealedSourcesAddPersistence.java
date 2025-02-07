/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchSealedSourcesAddException;
import com.nbp.hsra.application.service.model.SealedSourcesAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sealed sources add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SealedSourcesAddUtil
 * @generated
 */
@ProviderType
public interface SealedSourcesAddPersistence
	extends BasePersistence<SealedSourcesAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SealedSourcesAddUtil} to access the sealed sources add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching sealed sources adds
	 */
	public java.util.List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @return the range of matching sealed sources adds
	 */
	public java.util.List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sealed sources adds
	 */
	public java.util.List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sealed sources adds
	 */
	public java.util.List<SealedSourcesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a matching sealed sources add could not be found
	 */
	public SealedSourcesAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
				orderByComparator)
		throws NoSuchSealedSourcesAddException;

	/**
	 * Returns the first sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sealed sources add, or <code>null</code> if a matching sealed sources add could not be found
	 */
	public SealedSourcesAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
			orderByComparator);

	/**
	 * Returns the last sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a matching sealed sources add could not be found
	 */
	public SealedSourcesAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
				orderByComparator)
		throws NoSuchSealedSourcesAddException;

	/**
	 * Returns the last sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sealed sources add, or <code>null</code> if a matching sealed sources add could not be found
	 */
	public SealedSourcesAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
			orderByComparator);

	/**
	 * Returns the sealed sources adds before and after the current sealed sources add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param sealedSourcesAddId the primary key of the current sealed sources add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	public SealedSourcesAdd[] findBygetHsraById_PrevAndNext(
			long sealedSourcesAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
				orderByComparator)
		throws NoSuchSealedSourcesAddException;

	/**
	 * Removes all the sealed sources adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of sealed sources adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching sealed sources adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the sealed sources add in the entity cache if it is enabled.
	 *
	 * @param sealedSourcesAdd the sealed sources add
	 */
	public void cacheResult(SealedSourcesAdd sealedSourcesAdd);

	/**
	 * Caches the sealed sources adds in the entity cache if it is enabled.
	 *
	 * @param sealedSourcesAdds the sealed sources adds
	 */
	public void cacheResult(java.util.List<SealedSourcesAdd> sealedSourcesAdds);

	/**
	 * Creates a new sealed sources add with the primary key. Does not add the sealed sources add to the database.
	 *
	 * @param sealedSourcesAddId the primary key for the new sealed sources add
	 * @return the new sealed sources add
	 */
	public SealedSourcesAdd create(long sealedSourcesAddId);

	/**
	 * Removes the sealed sources add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add that was removed
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	public SealedSourcesAdd remove(long sealedSourcesAddId)
		throws NoSuchSealedSourcesAddException;

	public SealedSourcesAdd updateImpl(SealedSourcesAdd sealedSourcesAdd);

	/**
	 * Returns the sealed sources add with the primary key or throws a <code>NoSuchSealedSourcesAddException</code> if it could not be found.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add
	 * @throws NoSuchSealedSourcesAddException if a sealed sources add with the primary key could not be found
	 */
	public SealedSourcesAdd findByPrimaryKey(long sealedSourcesAddId)
		throws NoSuchSealedSourcesAddException;

	/**
	 * Returns the sealed sources add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add, or <code>null</code> if a sealed sources add with the primary key could not be found
	 */
	public SealedSourcesAdd fetchByPrimaryKey(long sealedSourcesAddId);

	/**
	 * Returns all the sealed sources adds.
	 *
	 * @return the sealed sources adds
	 */
	public java.util.List<SealedSourcesAdd> findAll();

	/**
	 * Returns a range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @return the range of sealed sources adds
	 */
	public java.util.List<SealedSourcesAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sealed sources adds
	 */
	public java.util.List<SealedSourcesAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sealed sources adds
	 */
	public java.util.List<SealedSourcesAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SealedSourcesAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sealed sources adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sealed sources adds.
	 *
	 * @return the number of sealed sources adds
	 */
	public int countAll();

}