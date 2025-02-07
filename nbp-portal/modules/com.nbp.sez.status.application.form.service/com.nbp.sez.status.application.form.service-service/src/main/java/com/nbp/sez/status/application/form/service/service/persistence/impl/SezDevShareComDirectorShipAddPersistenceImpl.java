/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevShareComDirectorShipAddException;
import com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd;
import com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevShareComDirectorShipAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevShareComDirectorShipAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareComDirectorShipAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareComDirectorShipAddUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the sez dev share com director ship add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevShareComDirectorShipAddPersistence.class)
public class SezDevShareComDirectorShipAddPersistenceImpl
	extends BasePersistenceImpl<SezDevShareComDirectorShipAdd>
	implements SezDevShareComDirectorShipAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevShareComDirectorShipAddUtil</code> to access the sez dev share com director ship add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevShareComDirectorShipAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share com director ship adds
	 */
	@Override
	public List<SezDevShareComDirectorShipAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @return the range of matching sez dev share com director ship adds
	 */
	@Override
	public List<SezDevShareComDirectorShipAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share com director ship adds
	 */
	@Override
	public List<SezDevShareComDirectorShipAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share com director ship adds
	 */
	@Override
	public List<SezDevShareComDirectorShipAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByAppId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByAppId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezDevShareComDirectorShipAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevShareComDirectorShipAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevShareComDirectorShipAdd
						sezDevShareComDirectorShipAdd : list) {

					if (sezStatusApplicationId !=
							sezDevShareComDirectorShipAdd.
								getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZDEVSHARECOMDIRECTORSHIPADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevShareComDirectorShipAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevShareComDirectorShipAdd>)QueryUtil.list(
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
	 * Returns the first sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a matching sez dev share com director ship add could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator)
		throws NoSuchSezDevShareComDirectorShipAddException {

		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevShareComDirectorShipAdd != null) {
			return sezDevShareComDirectorShipAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevShareComDirectorShipAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share com director ship add, or <code>null</code> if a matching sez dev share com director ship add could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator) {

		List<SezDevShareComDirectorShipAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a matching sez dev share com director ship add could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator)
		throws NoSuchSezDevShareComDirectorShipAddException {

		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevShareComDirectorShipAdd != null) {
			return sezDevShareComDirectorShipAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevShareComDirectorShipAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share com director ship add, or <code>null</code> if a matching sez dev share com director ship add could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevShareComDirectorShipAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev share com director ship adds before and after the current sez dev share com director ship add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the current sez dev share com director ship add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezDevSharComDirectorShipAddId,
				long sezStatusApplicationId,
				OrderByComparator<SezDevShareComDirectorShipAdd>
					orderByComparator)
		throws NoSuchSezDevShareComDirectorShipAddException {

		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd =
			findByPrimaryKey(sezDevSharComDirectorShipAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevShareComDirectorShipAdd[] array =
				new SezDevShareComDirectorShipAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevShareComDirectorShipAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevShareComDirectorShipAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevShareComDirectorShipAdd, sezStatusApplicationId,
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

	protected SezDevShareComDirectorShipAdd
		getBygetSezStatusByAppId_PrevAndNext(
			Session session,
			SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd,
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVSHARECOMDIRECTORSHIPADD_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

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
			sb.append(SezDevShareComDirectorShipAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezStatusApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezDevShareComDirectorShipAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevShareComDirectorShipAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev share com director ship adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevShareComDirectorShipAdd);
		}
	}

	/**
	 * Returns the number of sez dev share com director ship adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share com director ship adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVSHARECOMDIRECTORSHIPADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDevShareComDirectorShipAdd.sezStatusApplicationId = ?";

	public SezDevShareComDirectorShipAddPersistenceImpl() {
		setModelClass(SezDevShareComDirectorShipAdd.class);

		setModelImplClass(SezDevShareComDirectorShipAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevShareComDirectorShipAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev share com director ship add in the entity cache if it is enabled.
	 *
	 * @param sezDevShareComDirectorShipAdd the sez dev share com director ship add
	 */
	@Override
	public void cacheResult(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		entityCache.putResult(
			SezDevShareComDirectorShipAddImpl.class,
			sezDevShareComDirectorShipAdd.getPrimaryKey(),
			sezDevShareComDirectorShipAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev share com director ship adds in the entity cache if it is enabled.
	 *
	 * @param sezDevShareComDirectorShipAdds the sez dev share com director ship adds
	 */
	@Override
	public void cacheResult(
		List<SezDevShareComDirectorShipAdd> sezDevShareComDirectorShipAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevShareComDirectorShipAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd :
				sezDevShareComDirectorShipAdds) {

			if (entityCache.getResult(
					SezDevShareComDirectorShipAddImpl.class,
					sezDevShareComDirectorShipAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevShareComDirectorShipAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev share com director ship adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevShareComDirectorShipAddImpl.class);

		finderCache.clearCache(SezDevShareComDirectorShipAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev share com director ship add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		entityCache.removeResult(
			SezDevShareComDirectorShipAddImpl.class,
			sezDevShareComDirectorShipAdd);
	}

	@Override
	public void clearCache(
		List<SezDevShareComDirectorShipAdd> sezDevShareComDirectorShipAdds) {

		for (SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd :
				sezDevShareComDirectorShipAdds) {

			entityCache.removeResult(
				SezDevShareComDirectorShipAddImpl.class,
				sezDevShareComDirectorShipAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevShareComDirectorShipAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevShareComDirectorShipAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev share com director ship add with the primary key. Does not add the sez dev share com director ship add to the database.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key for the new sez dev share com director ship add
	 * @return the new sez dev share com director ship add
	 */
	@Override
	public SezDevShareComDirectorShipAdd create(
		long sezDevSharComDirectorShipAddId) {

		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd =
			new SezDevShareComDirectorShipAddImpl();

		sezDevShareComDirectorShipAdd.setNew(true);
		sezDevShareComDirectorShipAdd.setPrimaryKey(
			sezDevSharComDirectorShipAddId);

		sezDevShareComDirectorShipAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevShareComDirectorShipAdd;
	}

	/**
	 * Removes the sez dev share com director ship add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add that was removed
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd remove(
			long sezDevSharComDirectorShipAddId)
		throws NoSuchSezDevShareComDirectorShipAddException {

		return remove((Serializable)sezDevSharComDirectorShipAddId);
	}

	/**
	 * Removes the sez dev share com director ship add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add that was removed
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd remove(Serializable primaryKey)
		throws NoSuchSezDevShareComDirectorShipAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd =
				(SezDevShareComDirectorShipAdd)session.get(
					SezDevShareComDirectorShipAddImpl.class, primaryKey);

			if (sezDevShareComDirectorShipAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevShareComDirectorShipAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevShareComDirectorShipAdd);
		}
		catch (NoSuchSezDevShareComDirectorShipAddException
					noSuchEntityException) {

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
	protected SezDevShareComDirectorShipAdd removeImpl(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevShareComDirectorShipAdd)) {
				sezDevShareComDirectorShipAdd =
					(SezDevShareComDirectorShipAdd)session.get(
						SezDevShareComDirectorShipAddImpl.class,
						sezDevShareComDirectorShipAdd.getPrimaryKeyObj());
			}

			if (sezDevShareComDirectorShipAdd != null) {
				session.delete(sezDevShareComDirectorShipAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevShareComDirectorShipAdd != null) {
			clearCache(sezDevShareComDirectorShipAdd);
		}

		return sezDevShareComDirectorShipAdd;
	}

	@Override
	public SezDevShareComDirectorShipAdd updateImpl(
		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		boolean isNew = sezDevShareComDirectorShipAdd.isNew();

		if (!(sezDevShareComDirectorShipAdd instanceof
				SezDevShareComDirectorShipAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezDevShareComDirectorShipAdd.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevShareComDirectorShipAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevShareComDirectorShipAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevShareComDirectorShipAdd implementation " +
					sezDevShareComDirectorShipAdd.getClass());
		}

		SezDevShareComDirectorShipAddModelImpl
			sezDevShareComDirectorShipAddModelImpl =
				(SezDevShareComDirectorShipAddModelImpl)
					sezDevShareComDirectorShipAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevShareComDirectorShipAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevShareComDirectorShipAdd.setCreateDate(date);
			}
			else {
				sezDevShareComDirectorShipAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevShareComDirectorShipAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevShareComDirectorShipAdd.setModifiedDate(date);
			}
			else {
				sezDevShareComDirectorShipAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevShareComDirectorShipAdd);
			}
			else {
				sezDevShareComDirectorShipAdd =
					(SezDevShareComDirectorShipAdd)session.merge(
						sezDevShareComDirectorShipAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevShareComDirectorShipAddImpl.class,
			sezDevShareComDirectorShipAddModelImpl, false, true);

		if (isNew) {
			sezDevShareComDirectorShipAdd.setNew(false);
		}

		sezDevShareComDirectorShipAdd.resetOriginalValues();

		return sezDevShareComDirectorShipAdd;
	}

	/**
	 * Returns the sez dev share com director ship add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezDevShareComDirectorShipAddException {

		SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd =
			fetchByPrimaryKey(primaryKey);

		if (sezDevShareComDirectorShipAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevShareComDirectorShipAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevShareComDirectorShipAdd;
	}

	/**
	 * Returns the sez dev share com director ship add with the primary key or throws a <code>NoSuchSezDevShareComDirectorShipAddException</code> if it could not be found.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add
	 * @throws NoSuchSezDevShareComDirectorShipAddException if a sez dev share com director ship add with the primary key could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd findByPrimaryKey(
			long sezDevSharComDirectorShipAddId)
		throws NoSuchSezDevShareComDirectorShipAddException {

		return findByPrimaryKey((Serializable)sezDevSharComDirectorShipAddId);
	}

	/**
	 * Returns the sez dev share com director ship add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add, or <code>null</code> if a sez dev share com director ship add with the primary key could not be found
	 */
	@Override
	public SezDevShareComDirectorShipAdd fetchByPrimaryKey(
		long sezDevSharComDirectorShipAddId) {

		return fetchByPrimaryKey((Serializable)sezDevSharComDirectorShipAddId);
	}

	/**
	 * Returns all the sez dev share com director ship adds.
	 *
	 * @return the sez dev share com director ship adds
	 */
	@Override
	public List<SezDevShareComDirectorShipAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @return the range of sez dev share com director ship adds
	 */
	@Override
	public List<SezDevShareComDirectorShipAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share com director ship adds
	 */
	@Override
	public List<SezDevShareComDirectorShipAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share com director ship adds
	 */
	@Override
	public List<SezDevShareComDirectorShipAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareComDirectorShipAdd> orderByComparator,
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

		List<SezDevShareComDirectorShipAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevShareComDirectorShipAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVSHARECOMDIRECTORSHIPADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVSHARECOMDIRECTORSHIPADD;

				sql = sql.concat(
					SezDevShareComDirectorShipAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevShareComDirectorShipAdd>)QueryUtil.list(
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
	 * Removes all the sez dev share com director ship adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd :
				findAll()) {

			remove(sezDevShareComDirectorShipAdd);
		}
	}

	/**
	 * Returns the number of sez dev share com director ship adds.
	 *
	 * @return the number of sez dev share com director ship adds
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
					_SQL_COUNT_SEZDEVSHARECOMDIRECTORSHIPADD);

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
		return "sezDevSharComDirectorShipAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVSHARECOMDIRECTORSHIPADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevShareComDirectorShipAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev share com director ship add persistence.
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

		_finderPathWithPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezStatusByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezDevShareComDirectorShipAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevShareComDirectorShipAddUtil.setPersistence(null);

		entityCache.removeCache(
			SezDevShareComDirectorShipAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVSHARECOMDIRECTORSHIPADD =
		"SELECT sezDevShareComDirectorShipAdd FROM SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd";

	private static final String
		_SQL_SELECT_SEZDEVSHARECOMDIRECTORSHIPADD_WHERE =
			"SELECT sezDevShareComDirectorShipAdd FROM SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVSHARECOMDIRECTORSHIPADD =
		"SELECT COUNT(sezDevShareComDirectorShipAdd) FROM SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd";

	private static final String _SQL_COUNT_SEZDEVSHARECOMDIRECTORSHIPADD_WHERE =
		"SELECT COUNT(sezDevShareComDirectorShipAdd) FROM SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevShareComDirectorShipAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevShareComDirectorShipAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevShareComDirectorShipAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevShareComDirectorShipAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}