/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuCompanyInfoException;
import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu company info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoUtil
 * @generated
 */
@ProviderType
public interface ManuCompanyInfoPersistence
	extends BasePersistence<ManuCompanyInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuCompanyInfoUtil} to access the manu company info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuCompanyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	public ManuCompanyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuCompanyInfoException;

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	public ManuCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	public ManuCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu company info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu company info that was removed
	 */
	public ManuCompanyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuCompanyInfoException;

	/**
	 * Returns the number of manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company infos
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company infos
	 */
	public java.util.List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @return the range of matching manu company infos
	 */
	public java.util.List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu company infos
	 */
	public java.util.List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu company infos
	 */
	public java.util.List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	public ManuCompanyInfo findBygetMA_CI_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
				orderByComparator)
		throws NoSuchManuCompanyInfoException;

	/**
	 * Returns the first manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	public ManuCompanyInfo fetchBygetMA_CI_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
			orderByComparator);

	/**
	 * Returns the last manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	public ManuCompanyInfo findBygetMA_CI_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
				orderByComparator)
		throws NoSuchManuCompanyInfoException;

	/**
	 * Returns the last manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	public ManuCompanyInfo fetchBygetMA_CI_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
			orderByComparator);

	/**
	 * Returns the manu company infos before and after the current manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuCompanyInfoId the primary key of the current manu company info
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	public ManuCompanyInfo[] findBygetMA_CI_MAI_PrevAndNext(
			long manuCompanyInfoId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
				orderByComparator)
		throws NoSuchManuCompanyInfoException;

	/**
	 * Removes all the manu company infos where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_CI_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company infos
	 */
	public int countBygetMA_CI_MAI(long manufacturingApplicationId);

	/**
	 * Caches the manu company info in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfo the manu company info
	 */
	public void cacheResult(ManuCompanyInfo manuCompanyInfo);

	/**
	 * Caches the manu company infos in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfos the manu company infos
	 */
	public void cacheResult(java.util.List<ManuCompanyInfo> manuCompanyInfos);

	/**
	 * Creates a new manu company info with the primary key. Does not add the manu company info to the database.
	 *
	 * @param manuCompanyInfoId the primary key for the new manu company info
	 * @return the new manu company info
	 */
	public ManuCompanyInfo create(long manuCompanyInfoId);

	/**
	 * Removes the manu company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info that was removed
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	public ManuCompanyInfo remove(long manuCompanyInfoId)
		throws NoSuchManuCompanyInfoException;

	public ManuCompanyInfo updateImpl(ManuCompanyInfo manuCompanyInfo);

	/**
	 * Returns the manu company info with the primary key or throws a <code>NoSuchManuCompanyInfoException</code> if it could not be found.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	public ManuCompanyInfo findByPrimaryKey(long manuCompanyInfoId)
		throws NoSuchManuCompanyInfoException;

	/**
	 * Returns the manu company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info, or <code>null</code> if a manu company info with the primary key could not be found
	 */
	public ManuCompanyInfo fetchByPrimaryKey(long manuCompanyInfoId);

	/**
	 * Returns all the manu company infos.
	 *
	 * @return the manu company infos
	 */
	public java.util.List<ManuCompanyInfo> findAll();

	/**
	 * Returns a range of all the manu company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @return the range of manu company infos
	 */
	public java.util.List<ManuCompanyInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manu company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu company infos
	 */
	public java.util.List<ManuCompanyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu company infos
	 */
	public java.util.List<ManuCompanyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu company infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu company infos.
	 *
	 * @return the number of manu company infos
	 */
	public int countAll();

}