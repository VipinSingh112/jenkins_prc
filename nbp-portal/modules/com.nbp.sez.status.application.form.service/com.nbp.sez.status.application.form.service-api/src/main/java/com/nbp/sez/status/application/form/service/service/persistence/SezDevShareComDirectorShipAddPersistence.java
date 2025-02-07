/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevShareComDirectorShipAddException;
import com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev share com director ship add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareComDirectorShipAddUtil
 * @generated
 */
@ProviderType
public interface SezDevShareComDirectorShipAddPersistence
	extends BasePersistence<SezDevShareComDirectorShipAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevShareComDirectorShipAddUtil} to access the sez dev share com director ship add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share com director ship adds
	 */
	public java.util.List<SezDevShareComDirectorShipAdd>
		findBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @return the range of matching sez dev share com director ship adds
	 */
	public java.util.List<SezDevShareComDirectorShipAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share com director ship adds
	 */
	public java.util.List<SezDevShareComDirectorShipAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareComDirectorShipAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share com director ship adds
	 */
	public java.util.List<SezDevShareComDirectorShipAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareComDirectorShipAdd> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a matching sez dev share com director ship add could not be found
	 */
	public SezDevShareComDirectorShipAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareComDirectorShipAdd> orderByComparator)
		throws NoSuchSezDevShareComDirectorShipAddException;

	/**
	 * Returns the first sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share com director ship add, or <code>null</code> if a matching sez dev share com director ship add could not be found
	 */
	public SezDevShareComDirectorShipAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevShareComDirectorShipAdd> orderByComparator);

	/**
	 * Returns the last sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a matching sez dev share com director ship add could not be found
	 */
	public SezDevShareComDirectorShipAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareComDirectorShipAdd> orderByComparator)
		throws NoSuchSezDevShareComDirectorShipAddException;

	/**
	 * Returns the last sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share com director ship add, or <code>null</code> if a matching sez dev share com director ship add could not be found
	 */
	public SezDevShareComDirectorShipAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevShareComDirectorShipAdd> orderByComparator);

	/**
	 * Returns the sez dev share com director ship adds before and after the current sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the current sez dev share com director ship add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	public SezDevShareComDirectorShipAdd[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezDevSharComDirectorShipAddId,
				long sezStatusApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<SezDevShareComDirectorShipAdd> orderByComparator)
		throws NoSuchSezDevShareComDirectorShipAddException;

	/**
	 * Removes all the sez dev share com director ship adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share com director ship adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev share com director ship add in the entity cache if it is enabled.
	 *
	 * @param sezDevShareComDirectorShipAdd the sez dev share com director ship add
	 */
	public void cacheResult(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd);

	/**
	 * Caches the sez dev share com director ship adds in the entity cache if it is enabled.
	 *
	 * @param sezDevShareComDirectorShipAdds the sez dev share com director ship adds
	 */
	public void cacheResult(
		java.util.List<SezDevShareComDirectorShipAdd>
			sezDevShareComDirectorShipAdds);

	/**
	 * Creates a new sez dev share com director ship add with the primary key. Does not add the sez dev share com director ship add to the database.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key for the new sez dev share com director ship add
	 * @return the new sez dev share com director ship add
	 */
	public SezDevShareComDirectorShipAdd create(
		long sezDevSharComDirectorShipAddId);

	/**
	 * Removes the sez dev share com director ship add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add that was removed
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	public SezDevShareComDirectorShipAdd remove(
			long sezDevSharComDirectorShipAddId)
		throws NoSuchSezDevShareComDirectorShipAddException;

	public SezDevShareComDirectorShipAdd updateImpl(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd);

	/**
	 * Returns the sez dev share com director ship add with the primary key or throws a <code>NoSuchSezDevShareComDirectorShipAddException</code> if it could not be found.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	public SezDevShareComDirectorShipAdd findByPrimaryKey(
			long sezDevSharComDirectorShipAddId)
		throws NoSuchSezDevShareComDirectorShipAddException;

	/**
	 * Returns the sez dev share com director ship add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add, or <code>null</code> if a sez dev share com director ship add with the primary key could not be found
	 */
	public SezDevShareComDirectorShipAdd fetchByPrimaryKey(
		long sezDevSharComDirectorShipAddId);

	/**
	 * Returns all the sez dev share com director ship adds.
	 *
	 * @return the sez dev share com director ship adds
	 */
	public java.util.List<SezDevShareComDirectorShipAdd> findAll();

	/**
	 * Returns a range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @return the range of sez dev share com director ship adds
	 */
	public java.util.List<SezDevShareComDirectorShipAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share com director ship adds
	 */
	public java.util.List<SezDevShareComDirectorShipAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevShareComDirectorShipAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share com director ship adds
	 */
	public java.util.List<SezDevShareComDirectorShipAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevShareComDirectorShipAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev share com director ship adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev share com director ship adds.
	 *
	 * @return the number of sez dev share com director ship adds
	 */
	public int countAll();

}