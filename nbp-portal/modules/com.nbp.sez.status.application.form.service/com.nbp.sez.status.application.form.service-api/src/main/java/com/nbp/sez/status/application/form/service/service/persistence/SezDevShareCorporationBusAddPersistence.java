/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevShareCorporationBusAddException;
import com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev share corporation bus add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareCorporationBusAddUtil
 * @generated
 */
@ProviderType
public interface SezDevShareCorporationBusAddPersistence
	extends BasePersistence<SezDevShareCorporationBusAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevShareCorporationBusAddUtil} to access the sez dev share corporation bus add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share corporation bus adds
	 */
	public java.util.List<SezDevShareCorporationBusAdd>
		findBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @return the range of matching sez dev share corporation bus adds
	 */
	public java.util.List<SezDevShareCorporationBusAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share corporation bus adds
	 */
	public java.util.List<SezDevShareCorporationBusAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareCorporationBusAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share corporation bus adds
	 */
	public java.util.List<SezDevShareCorporationBusAdd>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareCorporationBusAdd> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a matching sez dev share corporation bus add could not be found
	 */
	public SezDevShareCorporationBusAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareCorporationBusAdd> orderByComparator)
		throws NoSuchSezDevShareCorporationBusAddException;

	/**
	 * Returns the first sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share corporation bus add, or <code>null</code> if a matching sez dev share corporation bus add could not be found
	 */
	public SezDevShareCorporationBusAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevShareCorporationBusAdd> orderByComparator);

	/**
	 * Returns the last sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a matching sez dev share corporation bus add could not be found
	 */
	public SezDevShareCorporationBusAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareCorporationBusAdd> orderByComparator)
		throws NoSuchSezDevShareCorporationBusAddException;

	/**
	 * Returns the last sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share corporation bus add, or <code>null</code> if a matching sez dev share corporation bus add could not be found
	 */
	public SezDevShareCorporationBusAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevShareCorporationBusAdd> orderByComparator);

	/**
	 * Returns the sez dev share corporation bus adds before and after the current sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the current sez dev share corporation bus add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a sez dev share corporation bus add with the primary key could not be found
	 */
	public SezDevShareCorporationBusAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevCorporationBusinessAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareCorporationBusAdd> orderByComparator)
		throws NoSuchSezDevShareCorporationBusAddException;

	/**
	 * Removes all the sez dev share corporation bus adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share corporation bus adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev share corporation bus add in the entity cache if it is enabled.
	 *
	 * @param sezDevShareCorporationBusAdd the sez dev share corporation bus add
	 */
	public void cacheResult(
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd);

	/**
	 * Caches the sez dev share corporation bus adds in the entity cache if it is enabled.
	 *
	 * @param sezDevShareCorporationBusAdds the sez dev share corporation bus adds
	 */
	public void cacheResult(
		java.util.List<SezDevShareCorporationBusAdd>
			sezDevShareCorporationBusAdds);

	/**
	 * Creates a new sez dev share corporation bus add with the primary key. Does not add the sez dev share corporation bus add to the database.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key for the new sez dev share corporation bus add
	 * @return the new sez dev share corporation bus add
	 */
	public SezDevShareCorporationBusAdd create(
		long sezDevCorporationBusinessAddId);

	/**
	 * Removes the sez dev share corporation bus add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add that was removed
	 * @throws NoSuchSezDevShareCorporationBusAddException if a sez dev share corporation bus add with the primary key could not be found
	 */
	public SezDevShareCorporationBusAdd remove(
			long sezDevCorporationBusinessAddId)
		throws NoSuchSezDevShareCorporationBusAddException;

	public SezDevShareCorporationBusAdd updateImpl(
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd);

	/**
	 * Returns the sez dev share corporation bus add with the primary key or throws a <code>NoSuchSezDevShareCorporationBusAddException</code> if it could not be found.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a sez dev share corporation bus add with the primary key could not be found
	 */
	public SezDevShareCorporationBusAdd findByPrimaryKey(
			long sezDevCorporationBusinessAddId)
		throws NoSuchSezDevShareCorporationBusAddException;

	/**
	 * Returns the sez dev share corporation bus add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add, or <code>null</code> if a sez dev share corporation bus add with the primary key could not be found
	 */
	public SezDevShareCorporationBusAdd fetchByPrimaryKey(
		long sezDevCorporationBusinessAddId);

	/**
	 * Returns all the sez dev share corporation bus adds.
	 *
	 * @return the sez dev share corporation bus adds
	 */
	public java.util.List<SezDevShareCorporationBusAdd> findAll();

	/**
	 * Returns a range of all the sez dev share corporation bus adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @return the range of sez dev share corporation bus adds
	 */
	public java.util.List<SezDevShareCorporationBusAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share corporation bus adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share corporation bus adds
	 */
	public java.util.List<SezDevShareCorporationBusAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevShareCorporationBusAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share corporation bus adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share corporation bus adds
	 */
	public java.util.List<SezDevShareCorporationBusAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevShareCorporationBusAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev share corporation bus adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev share corporation bus adds.
	 *
	 * @return the number of sez dev share corporation bus adds
	 */
	public int countAll();

}