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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevShareDirectorAddException;
import com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd;
import com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevShareDirectorAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevShareDirectorAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareDirectorAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareDirectorAddUtil;
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
 * The persistence implementation for the sez dev share director add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevShareDirectorAddPersistence.class)
public class SezDevShareDirectorAddPersistenceImpl
	extends BasePersistenceImpl<SezDevShareDirectorAdd>
	implements SezDevShareDirectorAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevShareDirectorAddUtil</code> to access the sez dev share director add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevShareDirectorAddImpl.class.getName();

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
	 * Returns all the sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share director adds
	 */
	@Override
	public List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

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
	@Override
	public List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<SezDevShareDirectorAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator,
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

		List<SezDevShareDirectorAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevShareDirectorAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevShareDirectorAdd sezDevShareDirectorAdd : list) {
					if (sezStatusApplicationId !=
							sezDevShareDirectorAdd.
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

			sb.append(_SQL_SELECT_SEZDEVSHAREDIRECTORADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevShareDirectorAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevShareDirectorAdd>)QueryUtil.list(
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
	 * Returns the first sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a matching sez dev share director add could not be found
	 */
	@Override
	public SezDevShareDirectorAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareDirectorAdd> orderByComparator)
		throws NoSuchSezDevShareDirectorAddException {

		SezDevShareDirectorAdd sezDevShareDirectorAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevShareDirectorAdd != null) {
			return sezDevShareDirectorAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevShareDirectorAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share director add, or <code>null</code> if a matching sez dev share director add could not be found
	 */
	@Override
	public SezDevShareDirectorAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		List<SezDevShareDirectorAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a matching sez dev share director add could not be found
	 */
	@Override
	public SezDevShareDirectorAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareDirectorAdd> orderByComparator)
		throws NoSuchSezDevShareDirectorAddException {

		SezDevShareDirectorAdd sezDevShareDirectorAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevShareDirectorAdd != null) {
			return sezDevShareDirectorAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevShareDirectorAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share director add, or <code>null</code> if a matching sez dev share director add could not be found
	 */
	@Override
	public SezDevShareDirectorAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevShareDirectorAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev share director adds before and after the current sez dev share director add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the current sez dev share director add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	@Override
	public SezDevShareDirectorAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevShareDirectorAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevShareDirectorAdd> orderByComparator)
		throws NoSuchSezDevShareDirectorAddException {

		SezDevShareDirectorAdd sezDevShareDirectorAdd = findByPrimaryKey(
			sezDevShareDirectorAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevShareDirectorAdd[] array = new SezDevShareDirectorAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevShareDirectorAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevShareDirectorAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevShareDirectorAdd, sezStatusApplicationId,
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

	protected SezDevShareDirectorAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezDevShareDirectorAdd sezDevShareDirectorAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVSHAREDIRECTORADD_WHERE);

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
			sb.append(SezDevShareDirectorAddModelImpl.ORDER_BY_JPQL);
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
						sezDevShareDirectorAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevShareDirectorAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev share director adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevShareDirectorAdd sezDevShareDirectorAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevShareDirectorAdd);
		}
	}

	/**
	 * Returns the number of sez dev share director adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share director adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVSHAREDIRECTORADD_WHERE);

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
			"sezDevShareDirectorAdd.sezStatusApplicationId = ?";

	public SezDevShareDirectorAddPersistenceImpl() {
		setModelClass(SezDevShareDirectorAdd.class);

		setModelImplClass(SezDevShareDirectorAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevShareDirectorAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev share director add in the entity cache if it is enabled.
	 *
	 * @param sezDevShareDirectorAdd the sez dev share director add
	 */
	@Override
	public void cacheResult(SezDevShareDirectorAdd sezDevShareDirectorAdd) {
		entityCache.putResult(
			SezDevShareDirectorAddImpl.class,
			sezDevShareDirectorAdd.getPrimaryKey(), sezDevShareDirectorAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev share director adds in the entity cache if it is enabled.
	 *
	 * @param sezDevShareDirectorAdds the sez dev share director adds
	 */
	@Override
	public void cacheResult(
		List<SezDevShareDirectorAdd> sezDevShareDirectorAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevShareDirectorAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevShareDirectorAdd sezDevShareDirectorAdd :
				sezDevShareDirectorAdds) {

			if (entityCache.getResult(
					SezDevShareDirectorAddImpl.class,
					sezDevShareDirectorAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevShareDirectorAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev share director adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevShareDirectorAddImpl.class);

		finderCache.clearCache(SezDevShareDirectorAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev share director add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevShareDirectorAdd sezDevShareDirectorAdd) {
		entityCache.removeResult(
			SezDevShareDirectorAddImpl.class, sezDevShareDirectorAdd);
	}

	@Override
	public void clearCache(
		List<SezDevShareDirectorAdd> sezDevShareDirectorAdds) {

		for (SezDevShareDirectorAdd sezDevShareDirectorAdd :
				sezDevShareDirectorAdds) {

			entityCache.removeResult(
				SezDevShareDirectorAddImpl.class, sezDevShareDirectorAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevShareDirectorAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevShareDirectorAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev share director add with the primary key. Does not add the sez dev share director add to the database.
	 *
	 * @param sezDevShareDirectorAddId the primary key for the new sez dev share director add
	 * @return the new sez dev share director add
	 */
	@Override
	public SezDevShareDirectorAdd create(long sezDevShareDirectorAddId) {
		SezDevShareDirectorAdd sezDevShareDirectorAdd =
			new SezDevShareDirectorAddImpl();

		sezDevShareDirectorAdd.setNew(true);
		sezDevShareDirectorAdd.setPrimaryKey(sezDevShareDirectorAddId);

		sezDevShareDirectorAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezDevShareDirectorAdd;
	}

	/**
	 * Removes the sez dev share director add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add that was removed
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	@Override
	public SezDevShareDirectorAdd remove(long sezDevShareDirectorAddId)
		throws NoSuchSezDevShareDirectorAddException {

		return remove((Serializable)sezDevShareDirectorAddId);
	}

	/**
	 * Removes the sez dev share director add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev share director add
	 * @return the sez dev share director add that was removed
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	@Override
	public SezDevShareDirectorAdd remove(Serializable primaryKey)
		throws NoSuchSezDevShareDirectorAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevShareDirectorAdd sezDevShareDirectorAdd =
				(SezDevShareDirectorAdd)session.get(
					SezDevShareDirectorAddImpl.class, primaryKey);

			if (sezDevShareDirectorAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevShareDirectorAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevShareDirectorAdd);
		}
		catch (NoSuchSezDevShareDirectorAddException noSuchEntityException) {
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
	protected SezDevShareDirectorAdd removeImpl(
		SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevShareDirectorAdd)) {
				sezDevShareDirectorAdd = (SezDevShareDirectorAdd)session.get(
					SezDevShareDirectorAddImpl.class,
					sezDevShareDirectorAdd.getPrimaryKeyObj());
			}

			if (sezDevShareDirectorAdd != null) {
				session.delete(sezDevShareDirectorAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevShareDirectorAdd != null) {
			clearCache(sezDevShareDirectorAdd);
		}

		return sezDevShareDirectorAdd;
	}

	@Override
	public SezDevShareDirectorAdd updateImpl(
		SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		boolean isNew = sezDevShareDirectorAdd.isNew();

		if (!(sezDevShareDirectorAdd instanceof
				SezDevShareDirectorAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevShareDirectorAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevShareDirectorAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevShareDirectorAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevShareDirectorAdd implementation " +
					sezDevShareDirectorAdd.getClass());
		}

		SezDevShareDirectorAddModelImpl sezDevShareDirectorAddModelImpl =
			(SezDevShareDirectorAddModelImpl)sezDevShareDirectorAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevShareDirectorAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevShareDirectorAdd.setCreateDate(date);
			}
			else {
				sezDevShareDirectorAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevShareDirectorAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevShareDirectorAdd.setModifiedDate(date);
			}
			else {
				sezDevShareDirectorAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevShareDirectorAdd);
			}
			else {
				sezDevShareDirectorAdd = (SezDevShareDirectorAdd)session.merge(
					sezDevShareDirectorAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevShareDirectorAddImpl.class, sezDevShareDirectorAddModelImpl,
			false, true);

		if (isNew) {
			sezDevShareDirectorAdd.setNew(false);
		}

		sezDevShareDirectorAdd.resetOriginalValues();

		return sezDevShareDirectorAdd;
	}

	/**
	 * Returns the sez dev share director add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev share director add
	 * @return the sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	@Override
	public SezDevShareDirectorAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevShareDirectorAddException {

		SezDevShareDirectorAdd sezDevShareDirectorAdd = fetchByPrimaryKey(
			primaryKey);

		if (sezDevShareDirectorAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevShareDirectorAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevShareDirectorAdd;
	}

	/**
	 * Returns the sez dev share director add with the primary key or throws a <code>NoSuchSezDevShareDirectorAddException</code> if it could not be found.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add
	 * @throws NoSuchSezDevShareDirectorAddException if a sez dev share director add with the primary key could not be found
	 */
	@Override
	public SezDevShareDirectorAdd findByPrimaryKey(
			long sezDevShareDirectorAddId)
		throws NoSuchSezDevShareDirectorAddException {

		return findByPrimaryKey((Serializable)sezDevShareDirectorAddId);
	}

	/**
	 * Returns the sez dev share director add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add, or <code>null</code> if a sez dev share director add with the primary key could not be found
	 */
	@Override
	public SezDevShareDirectorAdd fetchByPrimaryKey(
		long sezDevShareDirectorAddId) {

		return fetchByPrimaryKey((Serializable)sezDevShareDirectorAddId);
	}

	/**
	 * Returns all the sez dev share director adds.
	 *
	 * @return the sez dev share director adds
	 */
	@Override
	public List<SezDevShareDirectorAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SezDevShareDirectorAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<SezDevShareDirectorAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<SezDevShareDirectorAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareDirectorAdd> orderByComparator,
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

		List<SezDevShareDirectorAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevShareDirectorAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVSHAREDIRECTORADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVSHAREDIRECTORADD;

				sql = sql.concat(SezDevShareDirectorAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevShareDirectorAdd>)QueryUtil.list(
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
	 * Removes all the sez dev share director adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevShareDirectorAdd sezDevShareDirectorAdd : findAll()) {
			remove(sezDevShareDirectorAdd);
		}
	}

	/**
	 * Returns the number of sez dev share director adds.
	 *
	 * @return the number of sez dev share director adds
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
					_SQL_COUNT_SEZDEVSHAREDIRECTORADD);

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
		return "sezDevShareDirectorAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVSHAREDIRECTORADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevShareDirectorAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev share director add persistence.
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

		SezDevShareDirectorAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevShareDirectorAddUtil.setPersistence(null);

		entityCache.removeCache(SezDevShareDirectorAddImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVSHAREDIRECTORADD =
		"SELECT sezDevShareDirectorAdd FROM SezDevShareDirectorAdd sezDevShareDirectorAdd";

	private static final String _SQL_SELECT_SEZDEVSHAREDIRECTORADD_WHERE =
		"SELECT sezDevShareDirectorAdd FROM SezDevShareDirectorAdd sezDevShareDirectorAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVSHAREDIRECTORADD =
		"SELECT COUNT(sezDevShareDirectorAdd) FROM SezDevShareDirectorAdd sezDevShareDirectorAdd";

	private static final String _SQL_COUNT_SEZDEVSHAREDIRECTORADD_WHERE =
		"SELECT COUNT(sezDevShareDirectorAdd) FROM SezDevShareDirectorAdd sezDevShareDirectorAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevShareDirectorAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevShareDirectorAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevShareDirectorAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevShareDirectorAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}