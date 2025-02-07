/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaMedicalDeviceInfoException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaMedicalDeviceInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma medical device info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaMedicalDeviceInfoUtil
 * @generated
 */
@ProviderType
public interface PharmaMedicalDeviceInfoPersistence
	extends BasePersistence<PharmaMedicalDeviceInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaMedicalDeviceInfoUtil} to access the pharma medical device info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaMedicalDeviceInfoException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	public PharmaMedicalDeviceInfo findBygetPharmaByAppId(
			long pharmaApplicationId)
		throws NoSuchPharmaMedicalDeviceInfoException;

	/**
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	public PharmaMedicalDeviceInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId);

	/**
	 * Returns the pharma medical device info where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	public PharmaMedicalDeviceInfo fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma medical device info where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma medical device info that was removed
	 */
	public PharmaMedicalDeviceInfo removeBygetPharmaByAppId(
			long pharmaApplicationId)
		throws NoSuchPharmaMedicalDeviceInfoException;

	/**
	 * Returns the number of pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma medical device infos
	 */
	public int countBygetPharmaByAppId(long pharmaApplicationId);

	/**
	 * Returns all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma medical device infos
	 */
	public java.util.List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId);

	/**
	 * Returns a range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @return the range of matching pharma medical device infos
	 */
	public java.util.List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma medical device infos
	 */
	public java.util.List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaMedicalDeviceInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma medical device infos
	 */
	public java.util.List<PharmaMedicalDeviceInfo> findBygetPA_MD_PAI(
		long pharmaApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaMedicalDeviceInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	public PharmaMedicalDeviceInfo findBygetPA_MD_PAI_First(
			long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaMedicalDeviceInfo> orderByComparator)
		throws NoSuchPharmaMedicalDeviceInfoException;

	/**
	 * Returns the first pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	public PharmaMedicalDeviceInfo fetchBygetPA_MD_PAI_First(
		long pharmaApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaMedicalDeviceInfo> orderByComparator);

	/**
	 * Returns the last pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a matching pharma medical device info could not be found
	 */
	public PharmaMedicalDeviceInfo findBygetPA_MD_PAI_Last(
			long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaMedicalDeviceInfo> orderByComparator)
		throws NoSuchPharmaMedicalDeviceInfoException;

	/**
	 * Returns the last pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma medical device info, or <code>null</code> if a matching pharma medical device info could not be found
	 */
	public PharmaMedicalDeviceInfo fetchBygetPA_MD_PAI_Last(
		long pharmaApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaMedicalDeviceInfo> orderByComparator);

	/**
	 * Returns the pharma medical device infos before and after the current pharma medical device info in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the current pharma medical device info
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	public PharmaMedicalDeviceInfo[] findBygetPA_MD_PAI_PrevAndNext(
			long pharmaMedicalDeviceId, long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaMedicalDeviceInfo> orderByComparator)
		throws NoSuchPharmaMedicalDeviceInfoException;

	/**
	 * Removes all the pharma medical device infos where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	public void removeBygetPA_MD_PAI(long pharmaApplicationId);

	/**
	 * Returns the number of pharma medical device infos where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma medical device infos
	 */
	public int countBygetPA_MD_PAI(long pharmaApplicationId);

	/**
	 * Caches the pharma medical device info in the entity cache if it is enabled.
	 *
	 * @param pharmaMedicalDeviceInfo the pharma medical device info
	 */
	public void cacheResult(PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo);

	/**
	 * Caches the pharma medical device infos in the entity cache if it is enabled.
	 *
	 * @param pharmaMedicalDeviceInfos the pharma medical device infos
	 */
	public void cacheResult(
		java.util.List<PharmaMedicalDeviceInfo> pharmaMedicalDeviceInfos);

	/**
	 * Creates a new pharma medical device info with the primary key. Does not add the pharma medical device info to the database.
	 *
	 * @param pharmaMedicalDeviceId the primary key for the new pharma medical device info
	 * @return the new pharma medical device info
	 */
	public PharmaMedicalDeviceInfo create(long pharmaMedicalDeviceId);

	/**
	 * Removes the pharma medical device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info that was removed
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	public PharmaMedicalDeviceInfo remove(long pharmaMedicalDeviceId)
		throws NoSuchPharmaMedicalDeviceInfoException;

	public PharmaMedicalDeviceInfo updateImpl(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo);

	/**
	 * Returns the pharma medical device info with the primary key or throws a <code>NoSuchPharmaMedicalDeviceInfoException</code> if it could not be found.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info
	 * @throws NoSuchPharmaMedicalDeviceInfoException if a pharma medical device info with the primary key could not be found
	 */
	public PharmaMedicalDeviceInfo findByPrimaryKey(long pharmaMedicalDeviceId)
		throws NoSuchPharmaMedicalDeviceInfoException;

	/**
	 * Returns the pharma medical device info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaMedicalDeviceId the primary key of the pharma medical device info
	 * @return the pharma medical device info, or <code>null</code> if a pharma medical device info with the primary key could not be found
	 */
	public PharmaMedicalDeviceInfo fetchByPrimaryKey(
		long pharmaMedicalDeviceId);

	/**
	 * Returns all the pharma medical device infos.
	 *
	 * @return the pharma medical device infos
	 */
	public java.util.List<PharmaMedicalDeviceInfo> findAll();

	/**
	 * Returns a range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @return the range of pharma medical device infos
	 */
	public java.util.List<PharmaMedicalDeviceInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma medical device infos
	 */
	public java.util.List<PharmaMedicalDeviceInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaMedicalDeviceInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma medical device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaMedicalDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma medical device infos
	 * @param end the upper bound of the range of pharma medical device infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma medical device infos
	 */
	public java.util.List<PharmaMedicalDeviceInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaMedicalDeviceInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma medical device infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma medical device infos.
	 *
	 * @return the number of pharma medical device infos
	 */
	public int countAll();

}