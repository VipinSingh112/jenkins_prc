/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureCropException;
import com.agriculture.application.form.service.model.AgricultureCrop;
import com.agriculture.application.form.service.model.AgricultureCropTable;
import com.agriculture.application.form.service.model.impl.AgricultureCropImpl;
import com.agriculture.application.form.service.model.impl.AgricultureCropModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureCropPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureCropUtil;
import com.agriculture.application.form.service.service.persistence.impl.constants.AGRICULTUREPersistenceConstants;

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
 * The persistence implementation for the agriculture crop service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureCropPersistence.class)
public class AgricultureCropPersistenceImpl
	extends BasePersistenceImpl<AgricultureCrop>
	implements AgricultureCropPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureCropUtil</code> to access the agriculture crop persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureCropImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAgricultureById;
	private FinderPath _finderPathCountBygetAgricultureById;

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureCropException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	@Override
	public AgricultureCrop findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureCropException {

		AgricultureCrop agricultureCrop = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agricultureCrop == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureCropException(sb.toString());
		}

		return agricultureCrop;
	}

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	@Override
	public AgricultureCrop fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	@Override
	public AgricultureCrop fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {agricultureApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgricultureById, finderArgs, this);
		}

		if (result instanceof AgricultureCrop) {
			AgricultureCrop agricultureCrop = (AgricultureCrop)result;

			if (agricultureApplicationId !=
					agricultureCrop.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTURECROP_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureCrop> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgricultureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									agricultureApplicationId
								};
							}

							_log.warn(
								"AgricultureCropPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureCrop agricultureCrop = list.get(0);

					result = agricultureCrop;

					cacheResult(agricultureCrop);
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
			return (AgricultureCrop)result;
		}
	}

	/**
	 * Removes the agriculture crop where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture crop that was removed
	 */
	@Override
	public AgricultureCrop removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureCropException {

		AgricultureCrop agricultureCrop = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agricultureCrop);
	}

	/**
	 * Returns the number of agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture crops
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTURECROP_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2 =
			"agricultureCrop.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAC_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAC_by_AAI;
	private FinderPath _finderPathCountBygetAC_by_AAI;

	/**
	 * Returns all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crops
	 */
	@Override
	public List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId) {

		return findBygetAC_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @return the range of matching agriculture crops
	 */
	@Override
	public List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAC_by_AAI(agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture crops
	 */
	@Override
	public List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		return findBygetAC_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture crops
	 */
	@Override
	public List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAC_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAC_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureCrop> list = null;

		if (useFinderCache) {
			list = (List<AgricultureCrop>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureCrop agricultureCrop : list) {
					if (agricultureApplicationId !=
							agricultureCrop.getAgricultureApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRICULTURECROP_WHERE);

			sb.append(_FINDER_COLUMN_GETAC_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureCropModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgricultureCrop>)QueryUtil.list(
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
	 * Returns the first agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	@Override
	public AgricultureCrop findBygetAC_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureCrop> orderByComparator)
		throws NoSuchAgricultureCropException {

		AgricultureCrop agricultureCrop = fetchBygetAC_by_AAI_First(
			agricultureApplicationId, orderByComparator);

		if (agricultureCrop != null) {
			return agricultureCrop;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureCropException(sb.toString());
	}

	/**
	 * Returns the first agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	@Override
	public AgricultureCrop fetchBygetAC_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		List<AgricultureCrop> list = findBygetAC_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	@Override
	public AgricultureCrop findBygetAC_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureCrop> orderByComparator)
		throws NoSuchAgricultureCropException {

		AgricultureCrop agricultureCrop = fetchBygetAC_by_AAI_Last(
			agricultureApplicationId, orderByComparator);

		if (agricultureCrop != null) {
			return agricultureCrop;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureCropException(sb.toString());
	}

	/**
	 * Returns the last agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	@Override
	public AgricultureCrop fetchBygetAC_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		int count = countBygetAC_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureCrop> list = findBygetAC_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture crops before and after the current agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureCropId the primary key of the current agriculture crop
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture crop
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	@Override
	public AgricultureCrop[] findBygetAC_by_AAI_PrevAndNext(
			long agricultureCropId, long agricultureApplicationId,
			OrderByComparator<AgricultureCrop> orderByComparator)
		throws NoSuchAgricultureCropException {

		AgricultureCrop agricultureCrop = findByPrimaryKey(agricultureCropId);

		Session session = null;

		try {
			session = openSession();

			AgricultureCrop[] array = new AgricultureCropImpl[3];

			array[0] = getBygetAC_by_AAI_PrevAndNext(
				session, agricultureCrop, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agricultureCrop;

			array[2] = getBygetAC_by_AAI_PrevAndNext(
				session, agricultureCrop, agricultureApplicationId,
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

	protected AgricultureCrop getBygetAC_by_AAI_PrevAndNext(
		Session session, AgricultureCrop agricultureCrop,
		long agricultureApplicationId,
		OrderByComparator<AgricultureCrop> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTURECROP_WHERE);

		sb.append(_FINDER_COLUMN_GETAC_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgricultureCropModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(agricultureApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						agricultureCrop)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureCrop> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture crops where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAC_by_AAI(long agricultureApplicationId) {
		for (AgricultureCrop agricultureCrop :
				findBygetAC_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureCrop);
		}
	}

	/**
	 * Returns the number of agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture crops
	 */
	@Override
	public int countBygetAC_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAC_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTURECROP_WHERE);

			sb.append(_FINDER_COLUMN_GETAC_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_GETAC_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultureCrop.agricultureApplicationId = ?";

	public AgricultureCropPersistenceImpl() {
		setModelClass(AgricultureCrop.class);

		setModelImplClass(AgricultureCropImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureCropTable.INSTANCE);
	}

	/**
	 * Caches the agriculture crop in the entity cache if it is enabled.
	 *
	 * @param agricultureCrop the agriculture crop
	 */
	@Override
	public void cacheResult(AgricultureCrop agricultureCrop) {
		entityCache.putResult(
			AgricultureCropImpl.class, agricultureCrop.getPrimaryKey(),
			agricultureCrop);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultureCrop.getAgricultureApplicationId()},
			agricultureCrop);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture crops in the entity cache if it is enabled.
	 *
	 * @param agricultureCrops the agriculture crops
	 */
	@Override
	public void cacheResult(List<AgricultureCrop> agricultureCrops) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureCrops.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureCrop agricultureCrop : agricultureCrops) {
			if (entityCache.getResult(
					AgricultureCropImpl.class,
					agricultureCrop.getPrimaryKey()) == null) {

				cacheResult(agricultureCrop);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture crops.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureCropImpl.class);

		finderCache.clearCache(AgricultureCropImpl.class);
	}

	/**
	 * Clears the cache for the agriculture crop.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureCrop agricultureCrop) {
		entityCache.removeResult(AgricultureCropImpl.class, agricultureCrop);
	}

	@Override
	public void clearCache(List<AgricultureCrop> agricultureCrops) {
		for (AgricultureCrop agricultureCrop : agricultureCrops) {
			entityCache.removeResult(
				AgricultureCropImpl.class, agricultureCrop);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureCropImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AgricultureCropImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureCropModelImpl agricultureCropModelImpl) {

		Object[] args = new Object[] {
			agricultureCropModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultureCropModelImpl);
	}

	/**
	 * Creates a new agriculture crop with the primary key. Does not add the agriculture crop to the database.
	 *
	 * @param agricultureCropId the primary key for the new agriculture crop
	 * @return the new agriculture crop
	 */
	@Override
	public AgricultureCrop create(long agricultureCropId) {
		AgricultureCrop agricultureCrop = new AgricultureCropImpl();

		agricultureCrop.setNew(true);
		agricultureCrop.setPrimaryKey(agricultureCropId);

		agricultureCrop.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureCrop;
	}

	/**
	 * Removes the agriculture crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop that was removed
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	@Override
	public AgricultureCrop remove(long agricultureCropId)
		throws NoSuchAgricultureCropException {

		return remove((Serializable)agricultureCropId);
	}

	/**
	 * Removes the agriculture crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture crop
	 * @return the agriculture crop that was removed
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	@Override
	public AgricultureCrop remove(Serializable primaryKey)
		throws NoSuchAgricultureCropException {

		Session session = null;

		try {
			session = openSession();

			AgricultureCrop agricultureCrop = (AgricultureCrop)session.get(
				AgricultureCropImpl.class, primaryKey);

			if (agricultureCrop == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureCropException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureCrop);
		}
		catch (NoSuchAgricultureCropException noSuchEntityException) {
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
	protected AgricultureCrop removeImpl(AgricultureCrop agricultureCrop) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureCrop)) {
				agricultureCrop = (AgricultureCrop)session.get(
					AgricultureCropImpl.class,
					agricultureCrop.getPrimaryKeyObj());
			}

			if (agricultureCrop != null) {
				session.delete(agricultureCrop);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureCrop != null) {
			clearCache(agricultureCrop);
		}

		return agricultureCrop;
	}

	@Override
	public AgricultureCrop updateImpl(AgricultureCrop agricultureCrop) {
		boolean isNew = agricultureCrop.isNew();

		if (!(agricultureCrop instanceof AgricultureCropModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureCrop.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureCrop);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureCrop proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureCrop implementation " +
					agricultureCrop.getClass());
		}

		AgricultureCropModelImpl agricultureCropModelImpl =
			(AgricultureCropModelImpl)agricultureCrop;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureCrop.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureCrop.setCreateDate(date);
			}
			else {
				agricultureCrop.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureCropModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureCrop.setModifiedDate(date);
			}
			else {
				agricultureCrop.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureCrop);
			}
			else {
				agricultureCrop = (AgricultureCrop)session.merge(
					agricultureCrop);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureCropImpl.class, agricultureCropModelImpl, false, true);

		cacheUniqueFindersCache(agricultureCropModelImpl);

		if (isNew) {
			agricultureCrop.setNew(false);
		}

		agricultureCrop.resetOriginalValues();

		return agricultureCrop;
	}

	/**
	 * Returns the agriculture crop with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture crop
	 * @return the agriculture crop
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	@Override
	public AgricultureCrop findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureCropException {

		AgricultureCrop agricultureCrop = fetchByPrimaryKey(primaryKey);

		if (agricultureCrop == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureCropException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureCrop;
	}

	/**
	 * Returns the agriculture crop with the primary key or throws a <code>NoSuchAgricultureCropException</code> if it could not be found.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	@Override
	public AgricultureCrop findByPrimaryKey(long agricultureCropId)
		throws NoSuchAgricultureCropException {

		return findByPrimaryKey((Serializable)agricultureCropId);
	}

	/**
	 * Returns the agriculture crop with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop, or <code>null</code> if a agriculture crop with the primary key could not be found
	 */
	@Override
	public AgricultureCrop fetchByPrimaryKey(long agricultureCropId) {
		return fetchByPrimaryKey((Serializable)agricultureCropId);
	}

	/**
	 * Returns all the agriculture crops.
	 *
	 * @return the agriculture crops
	 */
	@Override
	public List<AgricultureCrop> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @return the range of agriculture crops
	 */
	@Override
	public List<AgricultureCrop> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture crops
	 */
	@Override
	public List<AgricultureCrop> findAll(
		int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture crops
	 */
	@Override
	public List<AgricultureCrop> findAll(
		int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator,
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

		List<AgricultureCrop> list = null;

		if (useFinderCache) {
			list = (List<AgricultureCrop>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTURECROP);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTURECROP;

				sql = sql.concat(AgricultureCropModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureCrop>)QueryUtil.list(
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
	 * Removes all the agriculture crops from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureCrop agricultureCrop : findAll()) {
			remove(agricultureCrop);
		}
	}

	/**
	 * Returns the number of agriculture crops.
	 *
	 * @return the number of agriculture crops
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_AGRICULTURECROP);

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
		return "agricultureCropId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTURECROP;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureCropModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture crop persistence.
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

		_finderPathFetchBygetAgricultureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgricultureById",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAgricultureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureById", new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		_finderPathWithPaginationFindBygetAC_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAC_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAC_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAC_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAC_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAC_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgricultureCropUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureCropUtil.setPersistence(null);

		entityCache.removeCache(AgricultureCropImpl.class.getName());
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_AGRICULTURECROP =
		"SELECT agricultureCrop FROM AgricultureCrop agricultureCrop";

	private static final String _SQL_SELECT_AGRICULTURECROP_WHERE =
		"SELECT agricultureCrop FROM AgricultureCrop agricultureCrop WHERE ";

	private static final String _SQL_COUNT_AGRICULTURECROP =
		"SELECT COUNT(agricultureCrop) FROM AgricultureCrop agricultureCrop";

	private static final String _SQL_COUNT_AGRICULTURECROP_WHERE =
		"SELECT COUNT(agricultureCrop) FROM AgricultureCrop agricultureCrop WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "agricultureCrop.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureCrop exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureCrop exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureCropPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}