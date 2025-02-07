/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevSharePrincipalAddException;
import com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev share principal add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePrincipalAddUtil
 * @generated
 */
@ProviderType
public interface SezDevSharePrincipalAddPersistence
	extends BasePersistence<SezDevSharePrincipalAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevSharePrincipalAddUtil} to access the sez dev share principal add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share principal adds
	 */
	public java.util.List<SezDevSharePrincipalAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @return the range of matching sez dev share principal adds
	 */
	public java.util.List<SezDevSharePrincipalAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share principal adds
	 */
	public java.util.List<SezDevSharePrincipalAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePrincipalAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share principal adds
	 */
	public java.util.List<SezDevSharePrincipalAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePrincipalAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a matching sez dev share principal add could not be found
	 */
	public SezDevSharePrincipalAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevSharePrincipalAdd> orderByComparator)
		throws NoSuchSezDevSharePrincipalAddException;

	/**
	 * Returns the first sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share principal add, or <code>null</code> if a matching sez dev share principal add could not be found
	 */
	public SezDevSharePrincipalAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePrincipalAdd> orderByComparator);

	/**
	 * Returns the last sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a matching sez dev share principal add could not be found
	 */
	public SezDevSharePrincipalAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevSharePrincipalAdd> orderByComparator)
		throws NoSuchSezDevSharePrincipalAddException;

	/**
	 * Returns the last sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share principal add, or <code>null</code> if a matching sez dev share principal add could not be found
	 */
	public SezDevSharePrincipalAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePrincipalAdd> orderByComparator);

	/**
	 * Returns the sez dev share principal adds before and after the current sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the current sez dev share principal add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a sez dev share principal add with the primary key could not be found
	 */
	public SezDevSharePrincipalAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevSharePrincipalAddId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezDevSharePrincipalAdd> orderByComparator)
		throws NoSuchSezDevSharePrincipalAddException;

	/**
	 * Removes all the sez dev share principal adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share principal adds
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev share principal add in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePrincipalAdd the sez dev share principal add
	 */
	public void cacheResult(SezDevSharePrincipalAdd sezDevSharePrincipalAdd);

	/**
	 * Caches the sez dev share principal adds in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePrincipalAdds the sez dev share principal adds
	 */
	public void cacheResult(
		java.util.List<SezDevSharePrincipalAdd> sezDevSharePrincipalAdds);

	/**
	 * Creates a new sez dev share principal add with the primary key. Does not add the sez dev share principal add to the database.
	 *
	 * @param sezDevSharePrincipalAddId the primary key for the new sez dev share principal add
	 * @return the new sez dev share principal add
	 */
	public SezDevSharePrincipalAdd create(long sezDevSharePrincipalAddId);

	/**
	 * Removes the sez dev share principal add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the sez dev share principal add
	 * @return the sez dev share principal add that was removed
	 * @throws NoSuchSezDevSharePrincipalAddException if a sez dev share principal add with the primary key could not be found
	 */
	public SezDevSharePrincipalAdd remove(long sezDevSharePrincipalAddId)
		throws NoSuchSezDevSharePrincipalAddException;

	public SezDevSharePrincipalAdd updateImpl(
		SezDevSharePrincipalAdd sezDevSharePrincipalAdd);

	/**
	 * Returns the sez dev share principal add with the primary key or throws a <code>NoSuchSezDevSharePrincipalAddException</code> if it could not be found.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the sez dev share principal add
	 * @return the sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a sez dev share principal add with the primary key could not be found
	 */
	public SezDevSharePrincipalAdd findByPrimaryKey(
			long sezDevSharePrincipalAddId)
		throws NoSuchSezDevSharePrincipalAddException;

	/**
	 * Returns the sez dev share principal add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the sez dev share principal add
	 * @return the sez dev share principal add, or <code>null</code> if a sez dev share principal add with the primary key could not be found
	 */
	public SezDevSharePrincipalAdd fetchByPrimaryKey(
		long sezDevSharePrincipalAddId);

	/**
	 * Returns all the sez dev share principal adds.
	 *
	 * @return the sez dev share principal adds
	 */
	public java.util.List<SezDevSharePrincipalAdd> findAll();

	/**
	 * Returns a range of all the sez dev share principal adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @return the range of sez dev share principal adds
	 */
	public java.util.List<SezDevSharePrincipalAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez dev share principal adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share principal adds
	 */
	public java.util.List<SezDevSharePrincipalAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePrincipalAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev share principal adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share principal adds
	 */
	public java.util.List<SezDevSharePrincipalAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevSharePrincipalAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev share principal adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev share principal adds.
	 *
	 * @return the number of sez dev share principal adds
	 */
	public int countAll();

}