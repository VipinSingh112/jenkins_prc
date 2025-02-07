/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchQualifedExpertAddException;
import com.nbp.hsra.application.service.model.QualifedExpertAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the qualifed expert add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertAddUtil
 * @generated
 */
@ProviderType
public interface QualifedExpertAddPersistence
	extends BasePersistence<QualifedExpertAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QualifedExpertAddUtil} to access the qualifed expert add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching qualifed expert adds
	 */
	public java.util.List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @return the range of matching qualifed expert adds
	 */
	public java.util.List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualifed expert adds
	 */
	public java.util.List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualifed expert adds
	 */
	public java.util.List<QualifedExpertAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a matching qualifed expert add could not be found
	 */
	public QualifedExpertAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
				orderByComparator)
		throws NoSuchQualifedExpertAddException;

	/**
	 * Returns the first qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert add, or <code>null</code> if a matching qualifed expert add could not be found
	 */
	public QualifedExpertAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
			orderByComparator);

	/**
	 * Returns the last qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a matching qualifed expert add could not be found
	 */
	public QualifedExpertAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
				orderByComparator)
		throws NoSuchQualifedExpertAddException;

	/**
	 * Returns the last qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert add, or <code>null</code> if a matching qualifed expert add could not be found
	 */
	public QualifedExpertAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
			orderByComparator);

	/**
	 * Returns the qualifed expert adds before and after the current qualifed expert add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param qualifedExpertAddId the primary key of the current qualifed expert add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	public QualifedExpertAdd[] findBygetHsraById_PrevAndNext(
			long qualifedExpertAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
				orderByComparator)
		throws NoSuchQualifedExpertAddException;

	/**
	 * Removes all the qualifed expert adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of qualifed expert adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching qualifed expert adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the qualifed expert add in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertAdd the qualifed expert add
	 */
	public void cacheResult(QualifedExpertAdd qualifedExpertAdd);

	/**
	 * Caches the qualifed expert adds in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertAdds the qualifed expert adds
	 */
	public void cacheResult(
		java.util.List<QualifedExpertAdd> qualifedExpertAdds);

	/**
	 * Creates a new qualifed expert add with the primary key. Does not add the qualifed expert add to the database.
	 *
	 * @param qualifedExpertAddId the primary key for the new qualifed expert add
	 * @return the new qualifed expert add
	 */
	public QualifedExpertAdd create(long qualifedExpertAddId);

	/**
	 * Removes the qualifed expert add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add that was removed
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	public QualifedExpertAdd remove(long qualifedExpertAddId)
		throws NoSuchQualifedExpertAddException;

	public QualifedExpertAdd updateImpl(QualifedExpertAdd qualifedExpertAdd);

	/**
	 * Returns the qualifed expert add with the primary key or throws a <code>NoSuchQualifedExpertAddException</code> if it could not be found.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add
	 * @throws NoSuchQualifedExpertAddException if a qualifed expert add with the primary key could not be found
	 */
	public QualifedExpertAdd findByPrimaryKey(long qualifedExpertAddId)
		throws NoSuchQualifedExpertAddException;

	/**
	 * Returns the qualifed expert add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add, or <code>null</code> if a qualifed expert add with the primary key could not be found
	 */
	public QualifedExpertAdd fetchByPrimaryKey(long qualifedExpertAddId);

	/**
	 * Returns all the qualifed expert adds.
	 *
	 * @return the qualifed expert adds
	 */
	public java.util.List<QualifedExpertAdd> findAll();

	/**
	 * Returns a range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @return the range of qualifed expert adds
	 */
	public java.util.List<QualifedExpertAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualifed expert adds
	 */
	public java.util.List<QualifedExpertAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualifed expert adds
	 */
	public java.util.List<QualifedExpertAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualifedExpertAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the qualifed expert adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of qualifed expert adds.
	 *
	 * @return the number of qualifed expert adds
	 */
	public int countAll();

}