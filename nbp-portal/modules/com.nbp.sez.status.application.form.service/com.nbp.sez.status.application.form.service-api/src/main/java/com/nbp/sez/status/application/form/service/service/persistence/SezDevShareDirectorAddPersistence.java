/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevShareDirectorAddException;
import com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev share director add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareDirectorAddUtil
 * @generated
 */
@ProviderType
public interface SezDevShareDirectorAddPersistence
	extends BasePersistence<SezDevShareDirectorAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevShareDirectorAddUtil} to access the sez dev share director add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share director adds
	 */
	public java.util.List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @return the range of matching sez dev share director adds
	 */
	public java.util.List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share director adds
	 */
	public java.util.List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevShareDirectorAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share director adds
	 */
	public java.util.List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevShareDirectorAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a matching sez dev share director add could not be found
	 */
	public SezDevShareDirectorAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareDirectorAdd> orderByComparator)
		throws NoSuchSezDevShareDirectorAddException;

	/**
	 * Returns the first sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share director add, or <code>null</code> if a matching sez dev share director add could not be found
	 */
	public SezDevShareDirectorAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevShareDirectorAdd>
			orderByComparator);

	/**
	 * Returns the last sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a matching sez dev share director add could not be found
	 */
	public SezDevShareDirectorAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareDirectorAdd> orderByComparator)
		throws NoSuchSezDevShareDirectorAddException;

	/**
	 * Returns the last sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share director add, or <code>null</code> if a matching sez dev share director add could not be found
	 */
	public SezDevShareDirectorAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevShareDirectorAdd>
			orderByComparator);

	/**
	 * Returns the sez dev share director adds before and after the current sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the current sez dev share director add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	public SezDevShareDirectorAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevShareDirectorAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevShareDirectorAdd> orderByComparator)
		throws NoSuchSezDevShareDirectorAddException;

	/**
	 * Removes all the sez dev share director adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share director adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev share director add in the entity cache if it is enabled.
	 *
	 * @param sezDevShareDirectorAdd the sez dev share director add
	 */
	public void cacheResult(SezDevShareDirectorAdd sezDevShareDirectorAdd);

	/**
	 * Caches the sez dev share director adds in the entity cache if it is enabled.
	 *
	 * @param sezDevShareDirectorAdds the sez dev share director adds
	 */
	public void cacheResult(
		java.util.List<SezDevShareDirectorAdd> sezDevShareDirectorAdds);

	/**
	 * Creates a new sez dev share director add with the primary key. Does not add the sez dev share director add to the database.
	 *
	 * @param sezDevShareDirectorAddId the primary key for the new sez dev share director add
	 * @return the new sez dev share director add
	 */
	public SezDevShareDirectorAdd create(long sezDevShareDirectorAddId);

	/**
	 * Removes the sez dev share director add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add that was removed
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	public SezDevShareDirectorAdd remove(long sezDevShareDirectorAddId)
		throws NoSuchSezDevShareDirectorAddException;

	public SezDevShareDirectorAdd updateImpl(
		SezDevShareDirectorAdd sezDevShareDirectorAdd);

	/**
	 * Returns the sez dev share director add with the primary key or throws a <code>NoSuchSezDevShareDirectorAddException</code> if it could not be found.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	public SezDevShareDirectorAdd findByPrimaryKey(
			long sezDevShareDirectorAddId)
		throws NoSuchSezDevShareDirectorAddException;

	/**
	 * Returns the sez dev share director add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add, or <code>null</code> if a sez dev share director add with the primary key could not be found
	 */
	public SezDevShareDirectorAdd fetchByPrimaryKey(
		long sezDevShareDirectorAddId);

	/**
	 * Returns all the sez dev share director adds.
	 *
	 * @return the sez dev share director adds
	 */
	public java.util.List<SezDevShareDirectorAdd> findAll();

	/**
	 * Returns a range of all the sez dev share director adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @return the range of sez dev share director adds
	 */
	public java.util.List<SezDevShareDirectorAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share director adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share director adds
	 */
	public java.util.List<SezDevShareDirectorAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevShareDirectorAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share director adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share director adds
	 */
	public java.util.List<SezDevShareDirectorAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevShareDirectorAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev share director adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev share director adds.
	 *
	 * @return the number of sez dev share director adds
	 */
	public int countAll();

}