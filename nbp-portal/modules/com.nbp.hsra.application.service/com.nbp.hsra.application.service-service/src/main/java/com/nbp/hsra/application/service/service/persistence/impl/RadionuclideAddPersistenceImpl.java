/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchRadionuclideAddException;
import com.nbp.hsra.application.service.model.RadionuclideAdd;
import com.nbp.hsra.application.service.model.RadionuclideAddTable;
import com.nbp.hsra.application.service.model.impl.RadionuclideAddImpl;
import com.nbp.hsra.application.service.model.impl.RadionuclideAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.RadionuclideAddPersistence;
import com.nbp.hsra.application.service.service.persistence.RadionuclideAddUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the radionuclide add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RadionuclideAddPersistence.class)
public class RadionuclideAddPersistenceImpl
	extends BasePersistenceImpl<RadionuclideAdd>
	implements RadionuclideAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RadionuclideAddUtil</code> to access the radionuclide add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RadionuclideAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetHsraById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide adds
	 */
	@Override
	public List<RadionuclideAdd> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @return the range of matching radionuclide adds
	 */
	@Override
	public List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radionuclide adds
	 */
	@Override
	public List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radionuclide adds
	 */
	@Override
	public List<RadionuclideAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<RadionuclideAdd> list = null;

		if (useFinderCache) {
			list = (List<RadionuclideAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RadionuclideAdd radionuclideAdd : list) {
					if (hsraApplicationId !=
							radionuclideAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_RADIONUCLIDEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(RadionuclideAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<RadionuclideAdd>)QueryUtil.list(
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
	 * Returns the first radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radionuclide add
	 * @throws NoSuchRadionuclideAddException if a matching radionuclide add could not be found
	 */
	@Override
	public RadionuclideAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<RadionuclideAdd> orderByComparator)
		throws NoSuchRadionuclideAddException {

		RadionuclideAdd radionuclideAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (radionuclideAdd != null) {
			return radionuclideAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchRadionuclideAddException(sb.toString());
	}

	/**
	 * Returns the first radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radionuclide add, or <code>null</code> if a matching radionuclide add could not be found
	 */
	@Override
	public RadionuclideAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		List<RadionuclideAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radionuclide add
	 * @throws NoSuchRadionuclideAddException if a matching radionuclide add could not be found
	 */
	@Override
	public RadionuclideAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<RadionuclideAdd> orderByComparator)
		throws NoSuchRadionuclideAddException {

		RadionuclideAdd radionuclideAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (radionuclideAdd != null) {
			return radionuclideAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchRadionuclideAddException(sb.toString());
	}

	/**
	 * Returns the last radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radionuclide add, or <code>null</code> if a matching radionuclide add could not be found
	 */
	@Override
	public RadionuclideAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<RadionuclideAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the radionuclide adds before and after the current radionuclide add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radionuclideAddId the primary key of the current radionuclide add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radionuclide add
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	@Override
	public RadionuclideAdd[] findBygetHsraById_PrevAndNext(
			long radionuclideAddId, long hsraApplicationId,
			OrderByComparator<RadionuclideAdd> orderByComparator)
		throws NoSuchRadionuclideAddException {

		RadionuclideAdd radionuclideAdd = findByPrimaryKey(radionuclideAddId);

		Session session = null;

		try {
			session = openSession();

			RadionuclideAdd[] array = new RadionuclideAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, radionuclideAdd, hsraApplicationId, orderByComparator,
				true);

			array[1] = radionuclideAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, radionuclideAdd, hsraApplicationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected RadionuclideAdd getBygetHsraById_PrevAndNext(
		Session session, RadionuclideAdd radionuclideAdd,
		long hsraApplicationId,
		OrderByComparator<RadionuclideAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_RADIONUCLIDEADD_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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
			sb.append(RadionuclideAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						radionuclideAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<RadionuclideAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the radionuclide adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (RadionuclideAdd radionuclideAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(radionuclideAdd);
		}
	}

	/**
	 * Returns the number of radionuclide adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radionuclide adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RADIONUCLIDEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"radionuclideAdd.hsraApplicationId = ?";

	public RadionuclideAddPersistenceImpl() {
		setModelClass(RadionuclideAdd.class);

		setModelImplClass(RadionuclideAddImpl.class);
		setModelPKClass(long.class);

		setTable(RadionuclideAddTable.INSTANCE);
	}

	/**
	 * Caches the radionuclide add in the entity cache if it is enabled.
	 *
	 * @param radionuclideAdd the radionuclide add
	 */
	@Override
	public void cacheResult(RadionuclideAdd radionuclideAdd) {
		entityCache.putResult(
			RadionuclideAddImpl.class, radionuclideAdd.getPrimaryKey(),
			radionuclideAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the radionuclide adds in the entity cache if it is enabled.
	 *
	 * @param radionuclideAdds the radionuclide adds
	 */
	@Override
	public void cacheResult(List<RadionuclideAdd> radionuclideAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (radionuclideAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RadionuclideAdd radionuclideAdd : radionuclideAdds) {
			if (entityCache.getResult(
					RadionuclideAddImpl.class,
					radionuclideAdd.getPrimaryKey()) == null) {

				cacheResult(radionuclideAdd);
			}
		}
	}

	/**
	 * Clears the cache for all radionuclide adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RadionuclideAddImpl.class);

		finderCache.clearCache(RadionuclideAddImpl.class);
	}

	/**
	 * Clears the cache for the radionuclide add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RadionuclideAdd radionuclideAdd) {
		entityCache.removeResult(RadionuclideAddImpl.class, radionuclideAdd);
	}

	@Override
	public void clearCache(List<RadionuclideAdd> radionuclideAdds) {
		for (RadionuclideAdd radionuclideAdd : radionuclideAdds) {
			entityCache.removeResult(
				RadionuclideAddImpl.class, radionuclideAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RadionuclideAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RadionuclideAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new radionuclide add with the primary key. Does not add the radionuclide add to the database.
	 *
	 * @param radionuclideAddId the primary key for the new radionuclide add
	 * @return the new radionuclide add
	 */
	@Override
	public RadionuclideAdd create(long radionuclideAddId) {
		RadionuclideAdd radionuclideAdd = new RadionuclideAddImpl();

		radionuclideAdd.setNew(true);
		radionuclideAdd.setPrimaryKey(radionuclideAddId);

		radionuclideAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return radionuclideAdd;
	}

	/**
	 * Removes the radionuclide add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add that was removed
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	@Override
	public RadionuclideAdd remove(long radionuclideAddId)
		throws NoSuchRadionuclideAddException {

		return remove((Serializable)radionuclideAddId);
	}

	/**
	 * Removes the radionuclide add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the radionuclide add
	 * @return the radionuclide add that was removed
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	@Override
	public RadionuclideAdd remove(Serializable primaryKey)
		throws NoSuchRadionuclideAddException {

		Session session = null;

		try {
			session = openSession();

			RadionuclideAdd radionuclideAdd = (RadionuclideAdd)session.get(
				RadionuclideAddImpl.class, primaryKey);

			if (radionuclideAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRadionuclideAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(radionuclideAdd);
		}
		catch (NoSuchRadionuclideAddException noSuchEntityException) {
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
	protected RadionuclideAdd removeImpl(RadionuclideAdd radionuclideAdd) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(radionuclideAdd)) {
				radionuclideAdd = (RadionuclideAdd)session.get(
					RadionuclideAddImpl.class,
					radionuclideAdd.getPrimaryKeyObj());
			}

			if (radionuclideAdd != null) {
				session.delete(radionuclideAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (radionuclideAdd != null) {
			clearCache(radionuclideAdd);
		}

		return radionuclideAdd;
	}

	@Override
	public RadionuclideAdd updateImpl(RadionuclideAdd radionuclideAdd) {
		boolean isNew = radionuclideAdd.isNew();

		if (!(radionuclideAdd instanceof RadionuclideAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(radionuclideAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					radionuclideAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in radionuclideAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RadionuclideAdd implementation " +
					radionuclideAdd.getClass());
		}

		RadionuclideAddModelImpl radionuclideAddModelImpl =
			(RadionuclideAddModelImpl)radionuclideAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (radionuclideAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				radionuclideAdd.setCreateDate(date);
			}
			else {
				radionuclideAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!radionuclideAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				radionuclideAdd.setModifiedDate(date);
			}
			else {
				radionuclideAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(radionuclideAdd);
			}
			else {
				radionuclideAdd = (RadionuclideAdd)session.merge(
					radionuclideAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RadionuclideAddImpl.class, radionuclideAddModelImpl, false, true);

		if (isNew) {
			radionuclideAdd.setNew(false);
		}

		radionuclideAdd.resetOriginalValues();

		return radionuclideAdd;
	}

	/**
	 * Returns the radionuclide add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the radionuclide add
	 * @return the radionuclide add
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	@Override
	public RadionuclideAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRadionuclideAddException {

		RadionuclideAdd radionuclideAdd = fetchByPrimaryKey(primaryKey);

		if (radionuclideAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRadionuclideAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return radionuclideAdd;
	}

	/**
	 * Returns the radionuclide add with the primary key or throws a <code>NoSuchRadionuclideAddException</code> if it could not be found.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add
	 * @throws NoSuchRadionuclideAddException if a radionuclide add with the primary key could not be found
	 */
	@Override
	public RadionuclideAdd findByPrimaryKey(long radionuclideAddId)
		throws NoSuchRadionuclideAddException {

		return findByPrimaryKey((Serializable)radionuclideAddId);
	}

	/**
	 * Returns the radionuclide add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add, or <code>null</code> if a radionuclide add with the primary key could not be found
	 */
	@Override
	public RadionuclideAdd fetchByPrimaryKey(long radionuclideAddId) {
		return fetchByPrimaryKey((Serializable)radionuclideAddId);
	}

	/**
	 * Returns all the radionuclide adds.
	 *
	 * @return the radionuclide adds
	 */
	@Override
	public List<RadionuclideAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @return the range of radionuclide adds
	 */
	@Override
	public List<RadionuclideAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radionuclide adds
	 */
	@Override
	public List<RadionuclideAdd> findAll(
		int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radionuclide adds
	 */
	@Override
	public List<RadionuclideAdd> findAll(
		int start, int end,
		OrderByComparator<RadionuclideAdd> orderByComparator,
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

		List<RadionuclideAdd> list = null;

		if (useFinderCache) {
			list = (List<RadionuclideAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RADIONUCLIDEADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RADIONUCLIDEADD;

				sql = sql.concat(RadionuclideAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RadionuclideAdd>)QueryUtil.list(
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
	 * Removes all the radionuclide adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RadionuclideAdd radionuclideAdd : findAll()) {
			remove(radionuclideAdd);
		}
	}

	/**
	 * Returns the number of radionuclide adds.
	 *
	 * @return the number of radionuclide adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RADIONUCLIDEADD);

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
		return "radionuclideAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RADIONUCLIDEADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RadionuclideAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the radionuclide add persistence.
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

		_finderPathWithPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		RadionuclideAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RadionuclideAddUtil.setPersistence(null);

		entityCache.removeCache(RadionuclideAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RADIONUCLIDEADD =
		"SELECT radionuclideAdd FROM RadionuclideAdd radionuclideAdd";

	private static final String _SQL_SELECT_RADIONUCLIDEADD_WHERE =
		"SELECT radionuclideAdd FROM RadionuclideAdd radionuclideAdd WHERE ";

	private static final String _SQL_COUNT_RADIONUCLIDEADD =
		"SELECT COUNT(radionuclideAdd) FROM RadionuclideAdd radionuclideAdd";

	private static final String _SQL_COUNT_RADIONUCLIDEADD_WHERE =
		"SELECT COUNT(radionuclideAdd) FROM RadionuclideAdd radionuclideAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "radionuclideAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RadionuclideAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RadionuclideAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RadionuclideAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}