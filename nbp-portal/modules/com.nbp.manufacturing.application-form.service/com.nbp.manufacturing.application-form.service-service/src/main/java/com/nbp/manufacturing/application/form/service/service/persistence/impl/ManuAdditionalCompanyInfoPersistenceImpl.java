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

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuAdditionalCompanyInfoException;
import com.nbp.manufacturing.application.form.service.model.ManuAdditionalCompanyInfo;
import com.nbp.manufacturing.application.form.service.model.ManuAdditionalCompanyInfoTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalCompanyInfoImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalCompanyInfoModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuAdditionalCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuAdditionalCompanyInfoUtil;
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
 * The persistence implementation for the manu additional company info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuAdditionalCompanyInfoPersistence.class)
public class ManuAdditionalCompanyInfoPersistenceImpl
	extends BasePersistenceImpl<ManuAdditionalCompanyInfo>
	implements ManuAdditionalCompanyInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuAdditionalCompanyInfoUtil</code> to access the manu additional company info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuAdditionalCompanyInfoImpl.class.getName();

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
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuAdditionalCompanyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuAdditionalCompanyInfoException {

		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo =
			fetchBygetManufactureById(manufacturingApplicationId);

		if (manuAdditionalCompanyInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuAdditionalCompanyInfoException(sb.toString());
		}

		return manuAdditionalCompanyInfo;
	}

	/**
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo fetchBygetManufactureById(
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

		if (result instanceof ManuAdditionalCompanyInfo) {
			ManuAdditionalCompanyInfo manuAdditionalCompanyInfo =
				(ManuAdditionalCompanyInfo)result;

			if (manufacturingApplicationId !=
					manuAdditionalCompanyInfo.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUADDITIONALCOMPANYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManuAdditionalCompanyInfo> list = query.list();

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
								"ManuAdditionalCompanyInfoPersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuAdditionalCompanyInfo manuAdditionalCompanyInfo =
						list.get(0);

					result = manuAdditionalCompanyInfo;

					cacheResult(manuAdditionalCompanyInfo);
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
			return (ManuAdditionalCompanyInfo)result;
		}
	}

	/**
	 * Removes the manu additional company info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu additional company info that was removed
	 */
	@Override
	public ManuAdditionalCompanyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuAdditionalCompanyInfoException {

		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo =
			findBygetManufactureById(manufacturingApplicationId);

		return remove(manuAdditionalCompanyInfo);
	}

	/**
	 * Returns the number of manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional company infos
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUADDITIONALCOMPANYINFO_WHERE);

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
			"manuAdditionalCompanyInfo.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_ACI_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_ACI_MAI;
	private FinderPath _finderPathCountBygetMA_ACI_MAI;

	/**
	 * Returns all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company infos
	 */
	@Override
	public List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_ACI_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @return the range of matching manu additional company infos
	 */
	@Override
	public List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_ACI_MAI(
			manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu additional company infos
	 */
	@Override
	public List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		return findBygetMA_ACI_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu additional company infos
	 */
	@Override
	public List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_ACI_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_ACI_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuAdditionalCompanyInfo> list = null;

		if (useFinderCache) {
			list = (List<ManuAdditionalCompanyInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuAdditionalCompanyInfo manuAdditionalCompanyInfo :
						list) {

					if (manufacturingApplicationId !=
							manuAdditionalCompanyInfo.
								getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_MANUADDITIONALCOMPANYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMA_ACI_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuAdditionalCompanyInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuAdditionalCompanyInfo>)QueryUtil.list(
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
	 * Returns the first manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo findBygetMA_ACI_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator)
		throws NoSuchManuAdditionalCompanyInfoException {

		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo =
			fetchBygetMA_ACI_MAI_First(
				manufacturingApplicationId, orderByComparator);

		if (manuAdditionalCompanyInfo != null) {
			return manuAdditionalCompanyInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuAdditionalCompanyInfoException(sb.toString());
	}

	/**
	 * Returns the first manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo fetchBygetMA_ACI_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		List<ManuAdditionalCompanyInfo> list = findBygetMA_ACI_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo findBygetMA_ACI_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator)
		throws NoSuchManuAdditionalCompanyInfoException {

		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo =
			fetchBygetMA_ACI_MAI_Last(
				manufacturingApplicationId, orderByComparator);

		if (manuAdditionalCompanyInfo != null) {
			return manuAdditionalCompanyInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuAdditionalCompanyInfoException(sb.toString());
	}

	/**
	 * Returns the last manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo fetchBygetMA_ACI_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		int count = countBygetMA_ACI_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuAdditionalCompanyInfo> list = findBygetMA_ACI_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu additional company infos before and after the current manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the current manu additional company info
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo[] findBygetMA_ACI_MAI_PrevAndNext(
			long manuAdditionalCompanyInfoId, long manufacturingApplicationId,
			OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator)
		throws NoSuchManuAdditionalCompanyInfoException {

		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo = findByPrimaryKey(
			manuAdditionalCompanyInfoId);

		Session session = null;

		try {
			session = openSession();

			ManuAdditionalCompanyInfo[] array =
				new ManuAdditionalCompanyInfoImpl[3];

			array[0] = getBygetMA_ACI_MAI_PrevAndNext(
				session, manuAdditionalCompanyInfo, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuAdditionalCompanyInfo;

			array[2] = getBygetMA_ACI_MAI_PrevAndNext(
				session, manuAdditionalCompanyInfo, manufacturingApplicationId,
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

	protected ManuAdditionalCompanyInfo getBygetMA_ACI_MAI_PrevAndNext(
		Session session, ManuAdditionalCompanyInfo manuAdditionalCompanyInfo,
		long manufacturingApplicationId,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUADDITIONALCOMPANYINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_ACI_MAI_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuAdditionalCompanyInfoModelImpl.ORDER_BY_JPQL);
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
						manuAdditionalCompanyInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuAdditionalCompanyInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu additional company infos where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_ACI_MAI(long manufacturingApplicationId) {
		for (ManuAdditionalCompanyInfo manuAdditionalCompanyInfo :
				findBygetMA_ACI_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuAdditionalCompanyInfo);
		}
	}

	/**
	 * Returns the number of manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional company infos
	 */
	@Override
	public int countBygetMA_ACI_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_ACI_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUADDITIONALCOMPANYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMA_ACI_MAI_MANUFACTURINGAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETMA_ACI_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"manuAdditionalCompanyInfo.manufacturingApplicationId = ?";

	public ManuAdditionalCompanyInfoPersistenceImpl() {
		setModelClass(ManuAdditionalCompanyInfo.class);

		setModelImplClass(ManuAdditionalCompanyInfoImpl.class);
		setModelPKClass(long.class);

		setTable(ManuAdditionalCompanyInfoTable.INSTANCE);
	}

	/**
	 * Caches the manu additional company info in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalCompanyInfo the manu additional company info
	 */
	@Override
	public void cacheResult(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		entityCache.putResult(
			ManuAdditionalCompanyInfoImpl.class,
			manuAdditionalCompanyInfo.getPrimaryKey(),
			manuAdditionalCompanyInfo);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {
				manuAdditionalCompanyInfo.getManufacturingApplicationId()
			},
			manuAdditionalCompanyInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu additional company infos in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalCompanyInfos the manu additional company infos
	 */
	@Override
	public void cacheResult(
		List<ManuAdditionalCompanyInfo> manuAdditionalCompanyInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuAdditionalCompanyInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuAdditionalCompanyInfo manuAdditionalCompanyInfo :
				manuAdditionalCompanyInfos) {

			if (entityCache.getResult(
					ManuAdditionalCompanyInfoImpl.class,
					manuAdditionalCompanyInfo.getPrimaryKey()) == null) {

				cacheResult(manuAdditionalCompanyInfo);
			}
		}
	}

	/**
	 * Clears the cache for all manu additional company infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuAdditionalCompanyInfoImpl.class);

		finderCache.clearCache(ManuAdditionalCompanyInfoImpl.class);
	}

	/**
	 * Clears the cache for the manu additional company info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		entityCache.removeResult(
			ManuAdditionalCompanyInfoImpl.class, manuAdditionalCompanyInfo);
	}

	@Override
	public void clearCache(
		List<ManuAdditionalCompanyInfo> manuAdditionalCompanyInfos) {

		for (ManuAdditionalCompanyInfo manuAdditionalCompanyInfo :
				manuAdditionalCompanyInfos) {

			entityCache.removeResult(
				ManuAdditionalCompanyInfoImpl.class, manuAdditionalCompanyInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuAdditionalCompanyInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManuAdditionalCompanyInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuAdditionalCompanyInfoModelImpl manuAdditionalCompanyInfoModelImpl) {

		Object[] args = new Object[] {
			manuAdditionalCompanyInfoModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			manuAdditionalCompanyInfoModelImpl);
	}

	/**
	 * Creates a new manu additional company info with the primary key. Does not add the manu additional company info to the database.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key for the new manu additional company info
	 * @return the new manu additional company info
	 */
	@Override
	public ManuAdditionalCompanyInfo create(long manuAdditionalCompanyInfoId) {
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo =
			new ManuAdditionalCompanyInfoImpl();

		manuAdditionalCompanyInfo.setNew(true);
		manuAdditionalCompanyInfo.setPrimaryKey(manuAdditionalCompanyInfoId);

		manuAdditionalCompanyInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return manuAdditionalCompanyInfo;
	}

	/**
	 * Removes the manu additional company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info that was removed
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo remove(long manuAdditionalCompanyInfoId)
		throws NoSuchManuAdditionalCompanyInfoException {

		return remove((Serializable)manuAdditionalCompanyInfoId);
	}

	/**
	 * Removes the manu additional company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu additional company info
	 * @return the manu additional company info that was removed
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo remove(Serializable primaryKey)
		throws NoSuchManuAdditionalCompanyInfoException {

		Session session = null;

		try {
			session = openSession();

			ManuAdditionalCompanyInfo manuAdditionalCompanyInfo =
				(ManuAdditionalCompanyInfo)session.get(
					ManuAdditionalCompanyInfoImpl.class, primaryKey);

			if (manuAdditionalCompanyInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuAdditionalCompanyInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuAdditionalCompanyInfo);
		}
		catch (NoSuchManuAdditionalCompanyInfoException noSuchEntityException) {
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
	protected ManuAdditionalCompanyInfo removeImpl(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuAdditionalCompanyInfo)) {
				manuAdditionalCompanyInfo =
					(ManuAdditionalCompanyInfo)session.get(
						ManuAdditionalCompanyInfoImpl.class,
						manuAdditionalCompanyInfo.getPrimaryKeyObj());
			}

			if (manuAdditionalCompanyInfo != null) {
				session.delete(manuAdditionalCompanyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuAdditionalCompanyInfo != null) {
			clearCache(manuAdditionalCompanyInfo);
		}

		return manuAdditionalCompanyInfo;
	}

	@Override
	public ManuAdditionalCompanyInfo updateImpl(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		boolean isNew = manuAdditionalCompanyInfo.isNew();

		if (!(manuAdditionalCompanyInfo instanceof
				ManuAdditionalCompanyInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuAdditionalCompanyInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuAdditionalCompanyInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuAdditionalCompanyInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuAdditionalCompanyInfo implementation " +
					manuAdditionalCompanyInfo.getClass());
		}

		ManuAdditionalCompanyInfoModelImpl manuAdditionalCompanyInfoModelImpl =
			(ManuAdditionalCompanyInfoModelImpl)manuAdditionalCompanyInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuAdditionalCompanyInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuAdditionalCompanyInfo.setCreateDate(date);
			}
			else {
				manuAdditionalCompanyInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuAdditionalCompanyInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuAdditionalCompanyInfo.setModifiedDate(date);
			}
			else {
				manuAdditionalCompanyInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuAdditionalCompanyInfo);
			}
			else {
				manuAdditionalCompanyInfo =
					(ManuAdditionalCompanyInfo)session.merge(
						manuAdditionalCompanyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuAdditionalCompanyInfoImpl.class,
			manuAdditionalCompanyInfoModelImpl, false, true);

		cacheUniqueFindersCache(manuAdditionalCompanyInfoModelImpl);

		if (isNew) {
			manuAdditionalCompanyInfo.setNew(false);
		}

		manuAdditionalCompanyInfo.resetOriginalValues();

		return manuAdditionalCompanyInfo;
	}

	/**
	 * Returns the manu additional company info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu additional company info
	 * @return the manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuAdditionalCompanyInfoException {

		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo = fetchByPrimaryKey(
			primaryKey);

		if (manuAdditionalCompanyInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuAdditionalCompanyInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuAdditionalCompanyInfo;
	}

	/**
	 * Returns the manu additional company info with the primary key or throws a <code>NoSuchManuAdditionalCompanyInfoException</code> if it could not be found.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo findByPrimaryKey(
			long manuAdditionalCompanyInfoId)
		throws NoSuchManuAdditionalCompanyInfoException {

		return findByPrimaryKey((Serializable)manuAdditionalCompanyInfoId);
	}

	/**
	 * Returns the manu additional company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info, or <code>null</code> if a manu additional company info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalCompanyInfo fetchByPrimaryKey(
		long manuAdditionalCompanyInfoId) {

		return fetchByPrimaryKey((Serializable)manuAdditionalCompanyInfoId);
	}

	/**
	 * Returns all the manu additional company infos.
	 *
	 * @return the manu additional company infos
	 */
	@Override
	public List<ManuAdditionalCompanyInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @return the range of manu additional company infos
	 */
	@Override
	public List<ManuAdditionalCompanyInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu additional company infos
	 */
	@Override
	public List<ManuAdditionalCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu additional company infos
	 */
	@Override
	public List<ManuAdditionalCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuAdditionalCompanyInfo> orderByComparator,
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

		List<ManuAdditionalCompanyInfo> list = null;

		if (useFinderCache) {
			list = (List<ManuAdditionalCompanyInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUADDITIONALCOMPANYINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUADDITIONALCOMPANYINFO;

				sql = sql.concat(
					ManuAdditionalCompanyInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuAdditionalCompanyInfo>)QueryUtil.list(
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
	 * Removes all the manu additional company infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuAdditionalCompanyInfo manuAdditionalCompanyInfo : findAll()) {
			remove(manuAdditionalCompanyInfo);
		}
	}

	/**
	 * Returns the number of manu additional company infos.
	 *
	 * @return the number of manu additional company infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_MANUADDITIONALCOMPANYINFO);

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
		return "manuAdditionalCompanyInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUADDITIONALCOMPANYINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuAdditionalCompanyInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu additional company info persistence.
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

		_finderPathWithPaginationFindBygetMA_ACI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_ACI_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_ACI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_ACI_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_ACI_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_ACI_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ManuAdditionalCompanyInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuAdditionalCompanyInfoUtil.setPersistence(null);

		entityCache.removeCache(ManuAdditionalCompanyInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_MANUADDITIONALCOMPANYINFO =
		"SELECT manuAdditionalCompanyInfo FROM ManuAdditionalCompanyInfo manuAdditionalCompanyInfo";

	private static final String _SQL_SELECT_MANUADDITIONALCOMPANYINFO_WHERE =
		"SELECT manuAdditionalCompanyInfo FROM ManuAdditionalCompanyInfo manuAdditionalCompanyInfo WHERE ";

	private static final String _SQL_COUNT_MANUADDITIONALCOMPANYINFO =
		"SELECT COUNT(manuAdditionalCompanyInfo) FROM ManuAdditionalCompanyInfo manuAdditionalCompanyInfo";

	private static final String _SQL_COUNT_MANUADDITIONALCOMPANYINFO_WHERE =
		"SELECT COUNT(manuAdditionalCompanyInfo) FROM ManuAdditionalCompanyInfo manuAdditionalCompanyInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manuAdditionalCompanyInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuAdditionalCompanyInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuAdditionalCompanyInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuAdditionalCompanyInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}