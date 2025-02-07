/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuCompanyInfoException;
import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo;
import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the manu company info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuCompanyInfoPersistence.class)
public class ManuCompanyInfoPersistenceImpl
	extends BasePersistenceImpl<ManuCompanyInfo>
	implements ManuCompanyInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuCompanyInfoUtil</code> to access the manu company info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuCompanyInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufactureById;
	private FinderPath _finderPathCountBygetManufactureById;

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuCompanyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	@Override
	public ManuCompanyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuCompanyInfoException {

		ManuCompanyInfo manuCompanyInfo = fetchBygetManufactureById(
			manufacturingApplicationId);

		if (manuCompanyInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuCompanyInfoException(sb.toString());
		}

		return manuCompanyInfo;
	}

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	@Override
	public ManuCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	@Override
	public ManuCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactureById, finderArgs, this);
		}

		if (result instanceof ManuCompanyInfo) {
			ManuCompanyInfo manuCompanyInfo = (ManuCompanyInfo)result;

			if (manufacturingApplicationId !=
					manuCompanyInfo.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUCOMPANYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManuCompanyInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManuCompanyInfoPersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuCompanyInfo manuCompanyInfo = list.get(0);

					result = manuCompanyInfo;

					cacheResult(manuCompanyInfo);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ManuCompanyInfo)result;
		}
	}

	/**
	 * Removes the manu company info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu company info that was removed
	 */
	@Override
	public ManuCompanyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuCompanyInfoException {

		ManuCompanyInfo manuCompanyInfo = findBygetManufactureById(
			manufacturingApplicationId);

		return remove(manuCompanyInfo);
	}

	/**
	 * Returns the number of manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company infos
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUCOMPANYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2 =
			"manuCompanyInfo.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_CI_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_CI_MAI;
	private FinderPath _finderPathCountBygetMA_CI_MAI;

	/**
	 * Returns all the manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company infos
	 */
	@Override
	public List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_CI_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_CI_MAI(manufacturingApplicationId, start, end, null);
	}

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
	@Override
	public List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		return findBygetMA_CI_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ManuCompanyInfo> findBygetMA_CI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_CI_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_CI_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuCompanyInfo> list = null;

		if (useFinderCache) {
			list = (List<ManuCompanyInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuCompanyInfo manuCompanyInfo : list) {
					if (manufacturingApplicationId !=
							manuCompanyInfo.getManufacturingApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MANUCOMPANYINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_CI_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuCompanyInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuCompanyInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	@Override
	public ManuCompanyInfo findBygetMA_CI_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfo> orderByComparator)
		throws NoSuchManuCompanyInfoException {

		ManuCompanyInfo manuCompanyInfo = fetchBygetMA_CI_MAI_First(
			manufacturingApplicationId, orderByComparator);

		if (manuCompanyInfo != null) {
			return manuCompanyInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuCompanyInfoException(sb.toString());
	}

	/**
	 * Returns the first manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	@Override
	public ManuCompanyInfo fetchBygetMA_CI_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		List<ManuCompanyInfo> list = findBygetMA_CI_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info
	 * @throws NoSuchManuCompanyInfoException if a matching manu company info could not be found
	 */
	@Override
	public ManuCompanyInfo findBygetMA_CI_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfo> orderByComparator)
		throws NoSuchManuCompanyInfoException {

		ManuCompanyInfo manuCompanyInfo = fetchBygetMA_CI_MAI_Last(
			manufacturingApplicationId, orderByComparator);

		if (manuCompanyInfo != null) {
			return manuCompanyInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuCompanyInfoException(sb.toString());
	}

	/**
	 * Returns the last manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info, or <code>null</code> if a matching manu company info could not be found
	 */
	@Override
	public ManuCompanyInfo fetchBygetMA_CI_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		int count = countBygetMA_CI_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuCompanyInfo> list = findBygetMA_CI_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu company infos before and after the current manu company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuCompanyInfoId the primary key of the current manu company info
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfo[] findBygetMA_CI_MAI_PrevAndNext(
			long manuCompanyInfoId, long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfo> orderByComparator)
		throws NoSuchManuCompanyInfoException {

		ManuCompanyInfo manuCompanyInfo = findByPrimaryKey(manuCompanyInfoId);

		Session session = null;

		try {
			session = openSession();

			ManuCompanyInfo[] array = new ManuCompanyInfoImpl[3];

			array[0] = getBygetMA_CI_MAI_PrevAndNext(
				session, manuCompanyInfo, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuCompanyInfo;

			array[2] = getBygetMA_CI_MAI_PrevAndNext(
				session, manuCompanyInfo, manufacturingApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuCompanyInfo getBygetMA_CI_MAI_PrevAndNext(
		Session session, ManuCompanyInfo manuCompanyInfo,
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfo> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MANUCOMPANYINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_CI_MAI_MANUFACTURINGAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ManuCompanyInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuCompanyInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuCompanyInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu company infos where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_CI_MAI(long manufacturingApplicationId) {
		for (ManuCompanyInfo manuCompanyInfo :
				findBygetMA_CI_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuCompanyInfo);
		}
	}

	/**
	 * Returns the number of manu company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company infos
	 */
	@Override
	public int countBygetMA_CI_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_CI_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUCOMPANYINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_CI_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMA_CI_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"manuCompanyInfo.manufacturingApplicationId = ?";

	public ManuCompanyInfoPersistenceImpl() {
		setModelClass(ManuCompanyInfo.class);

		setModelImplClass(ManuCompanyInfoImpl.class);
		setModelPKClass(long.class);

		setTable(ManuCompanyInfoTable.INSTANCE);
	}

	/**
	 * Caches the manu company info in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfo the manu company info
	 */
	@Override
	public void cacheResult(ManuCompanyInfo manuCompanyInfo) {
		entityCache.putResult(
			ManuCompanyInfoImpl.class, manuCompanyInfo.getPrimaryKey(),
			manuCompanyInfo);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {manuCompanyInfo.getManufacturingApplicationId()},
			manuCompanyInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu company infos in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfos the manu company infos
	 */
	@Override
	public void cacheResult(List<ManuCompanyInfo> manuCompanyInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuCompanyInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuCompanyInfo manuCompanyInfo : manuCompanyInfos) {
			if (entityCache.getResult(
					ManuCompanyInfoImpl.class,
					manuCompanyInfo.getPrimaryKey()) == null) {

				cacheResult(manuCompanyInfo);
			}
		}
	}

	/**
	 * Clears the cache for all manu company infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuCompanyInfoImpl.class);

		finderCache.clearCache(ManuCompanyInfoImpl.class);
	}

	/**
	 * Clears the cache for the manu company info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManuCompanyInfo manuCompanyInfo) {
		entityCache.removeResult(ManuCompanyInfoImpl.class, manuCompanyInfo);
	}

	@Override
	public void clearCache(List<ManuCompanyInfo> manuCompanyInfos) {
		for (ManuCompanyInfo manuCompanyInfo : manuCompanyInfos) {
			entityCache.removeResult(
				ManuCompanyInfoImpl.class, manuCompanyInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuCompanyInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ManuCompanyInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuCompanyInfoModelImpl manuCompanyInfoModelImpl) {

		Object[] args = new Object[] {
			manuCompanyInfoModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			manuCompanyInfoModelImpl);
	}

	/**
	 * Creates a new manu company info with the primary key. Does not add the manu company info to the database.
	 *
	 * @param manuCompanyInfoId the primary key for the new manu company info
	 * @return the new manu company info
	 */
	@Override
	public ManuCompanyInfo create(long manuCompanyInfoId) {
		ManuCompanyInfo manuCompanyInfo = new ManuCompanyInfoImpl();

		manuCompanyInfo.setNew(true);
		manuCompanyInfo.setPrimaryKey(manuCompanyInfoId);

		manuCompanyInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return manuCompanyInfo;
	}

	/**
	 * Removes the manu company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info that was removed
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfo remove(long manuCompanyInfoId)
		throws NoSuchManuCompanyInfoException {

		return remove((Serializable)manuCompanyInfoId);
	}

	/**
	 * Removes the manu company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu company info
	 * @return the manu company info that was removed
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfo remove(Serializable primaryKey)
		throws NoSuchManuCompanyInfoException {

		Session session = null;

		try {
			session = openSession();

			ManuCompanyInfo manuCompanyInfo = (ManuCompanyInfo)session.get(
				ManuCompanyInfoImpl.class, primaryKey);

			if (manuCompanyInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuCompanyInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuCompanyInfo);
		}
		catch (NoSuchManuCompanyInfoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ManuCompanyInfo removeImpl(ManuCompanyInfo manuCompanyInfo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuCompanyInfo)) {
				manuCompanyInfo = (ManuCompanyInfo)session.get(
					ManuCompanyInfoImpl.class,
					manuCompanyInfo.getPrimaryKeyObj());
			}

			if (manuCompanyInfo != null) {
				session.delete(manuCompanyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuCompanyInfo != null) {
			clearCache(manuCompanyInfo);
		}

		return manuCompanyInfo;
	}

	@Override
	public ManuCompanyInfo updateImpl(ManuCompanyInfo manuCompanyInfo) {
		boolean isNew = manuCompanyInfo.isNew();

		if (!(manuCompanyInfo instanceof ManuCompanyInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuCompanyInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuCompanyInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuCompanyInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuCompanyInfo implementation " +
					manuCompanyInfo.getClass());
		}

		ManuCompanyInfoModelImpl manuCompanyInfoModelImpl =
			(ManuCompanyInfoModelImpl)manuCompanyInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuCompanyInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuCompanyInfo.setCreateDate(date);
			}
			else {
				manuCompanyInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuCompanyInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuCompanyInfo.setModifiedDate(date);
			}
			else {
				manuCompanyInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuCompanyInfo);
			}
			else {
				manuCompanyInfo = (ManuCompanyInfo)session.merge(
					manuCompanyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuCompanyInfoImpl.class, manuCompanyInfoModelImpl, false, true);

		cacheUniqueFindersCache(manuCompanyInfoModelImpl);

		if (isNew) {
			manuCompanyInfo.setNew(false);
		}

		manuCompanyInfo.resetOriginalValues();

		return manuCompanyInfo;
	}

	/**
	 * Returns the manu company info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu company info
	 * @return the manu company info
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuCompanyInfoException {

		ManuCompanyInfo manuCompanyInfo = fetchByPrimaryKey(primaryKey);

		if (manuCompanyInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuCompanyInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuCompanyInfo;
	}

	/**
	 * Returns the manu company info with the primary key or throws a <code>NoSuchManuCompanyInfoException</code> if it could not be found.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info
	 * @throws NoSuchManuCompanyInfoException if a manu company info with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfo findByPrimaryKey(long manuCompanyInfoId)
		throws NoSuchManuCompanyInfoException {

		return findByPrimaryKey((Serializable)manuCompanyInfoId);
	}

	/**
	 * Returns the manu company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info, or <code>null</code> if a manu company info with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfo fetchByPrimaryKey(long manuCompanyInfoId) {
		return fetchByPrimaryKey((Serializable)manuCompanyInfoId);
	}

	/**
	 * Returns all the manu company infos.
	 *
	 * @return the manu company infos
	 */
	@Override
	public List<ManuCompanyInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ManuCompanyInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ManuCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<ManuCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuCompanyInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ManuCompanyInfo> list = null;

		if (useFinderCache) {
			list = (List<ManuCompanyInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUCOMPANYINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUCOMPANYINFO;

				sql = sql.concat(ManuCompanyInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuCompanyInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the manu company infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuCompanyInfo manuCompanyInfo : findAll()) {
			remove(manuCompanyInfo);
		}
	}

	/**
	 * Returns the number of manu company infos.
	 *
	 * @return the number of manu company infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MANUCOMPANYINFO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "manuCompanyInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUCOMPANYINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuCompanyInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu company info persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactureById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactureById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_CI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_CI_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_CI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_CI_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_CI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_CI_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ManuCompanyInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuCompanyInfoUtil.setPersistence(null);

		entityCache.removeCache(ManuCompanyInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUCOMPANYINFO =
		"SELECT manuCompanyInfo FROM ManuCompanyInfo manuCompanyInfo";

	private static final String _SQL_SELECT_MANUCOMPANYINFO_WHERE =
		"SELECT manuCompanyInfo FROM ManuCompanyInfo manuCompanyInfo WHERE ";

	private static final String _SQL_COUNT_MANUCOMPANYINFO =
		"SELECT COUNT(manuCompanyInfo) FROM ManuCompanyInfo manuCompanyInfo";

	private static final String _SQL_COUNT_MANUCOMPANYINFO_WHERE =
		"SELECT COUNT(manuCompanyInfo) FROM ManuCompanyInfo manuCompanyInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "manuCompanyInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuCompanyInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuCompanyInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuCompanyInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}