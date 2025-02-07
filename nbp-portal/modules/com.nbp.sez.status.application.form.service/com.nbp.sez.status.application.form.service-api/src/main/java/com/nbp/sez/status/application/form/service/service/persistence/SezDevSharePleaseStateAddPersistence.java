/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevSharePleaseStateAddException;
import com.nbp.sez.status.application.form.service.model.SezDevSharePleaseStateAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev share please state add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePleaseStateAddUtil
 * @generated
 */
@ProviderType
public interface SezDevSharePleaseStateAddPersistence
	extends BasePersistence<SezDevSharePleaseStateAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevSharePleaseStateAddUtil} to access the sez dev share please state add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share please state adds
	 */
	public java.util.List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @return the range of matching sez dev share please state adds
	 */
	public java.util.List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share please state adds
	 */
	public java.util.List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePleaseStateAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share please state adds
	 */
	public java.util.List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePleaseStateAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a matching sez dev share please state add could not be found
	 */
	public SezDevSharePleaseStateAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevSharePleaseStateAdd> orderByComparator)
		throws NoSuchSezDevSharePleaseStateAddException;

	/**
	 * Returns the first sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share please state add, or <code>null</code> if a matching sez dev share please state add could not be found
	 */
	public SezDevSharePleaseStateAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePleaseStateAdd> orderByComparator);

	/**
	 * Returns the last sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a matching sez dev share please state add could not be found
	 */
	public SezDevSharePleaseStateAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevSharePleaseStateAdd> orderByComparator)
		throws NoSuchSezDevSharePleaseStateAddException;

	/**
	 * Returns the last sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share please state add, or <code>null</code> if a matching sez dev share please state add could not be found
	 */
	public SezDevSharePleaseStateAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePleaseStateAdd> orderByComparator);

	/**
	 * Returns the sez dev share please state adds before and after the current sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the current sez dev share please state add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	public SezDevSharePleaseStateAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevPleaseStateAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevSharePleaseStateAdd> orderByComparator)
		throws NoSuchSezDevSharePleaseStateAddException;

	/**
	 * Removes all the sez dev share please state adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share please state adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev share please state add in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePleaseStateAdd the sez dev share please state add
	 */
	public void cacheResult(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd);

	/**
	 * Caches the sez dev share please state adds in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePleaseStateAdds the sez dev share please state adds
	 */
	public void cacheResult(
		java.util.List<SezDevSharePleaseStateAdd> sezDevSharePleaseStateAdds);

	/**
	 * Creates a new sez dev share please state add with the primary key. Does not add the sez dev share please state add to the database.
	 *
	 * @param sezDevPleaseStateAddId the primary key for the new sez dev share please state add
	 * @return the new sez dev share please state add
	 */
	public SezDevSharePleaseStateAdd create(long sezDevPleaseStateAddId);

	/**
	 * Removes the sez dev share please state add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add that was removed
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	public SezDevSharePleaseStateAdd remove(long sezDevPleaseStateAddId)
		throws NoSuchSezDevSharePleaseStateAddException;

	public SezDevSharePleaseStateAdd updateImpl(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd);

	/**
	 * Returns the sez dev share please state add with the primary key or throws a <code>NoSuchSezDevSharePleaseStateAddException</code> if it could not be found.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	public SezDevSharePleaseStateAdd findByPrimaryKey(
			long sezDevPleaseStateAddId)
		throws NoSuchSezDevSharePleaseStateAddException;

	/**
	 * Returns the sez dev share please state add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add, or <code>null</code> if a sez dev share please state add with the primary key could not be found
	 */
	public SezDevSharePleaseStateAdd fetchByPrimaryKey(
		long sezDevPleaseStateAddId);

	/**
	 * Returns all the sez dev share please state adds.
	 *
	 * @return the sez dev share please state adds
	 */
	public java.util.List<SezDevSharePleaseStateAdd> findAll();

	/**
	 * Returns a range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @return the range of sez dev share please state adds
	 */
	public java.util.List<SezDevSharePleaseStateAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share please state adds
	 */
	public java.util.List<SezDevSharePleaseStateAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePleaseStateAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share please state adds
	 */
	public java.util.List<SezDevSharePleaseStateAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePleaseStateAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev share please state adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev share please state adds.
	 *
	 * @return the number of sez dev share please state adds
	 */
	public int countAll();

}