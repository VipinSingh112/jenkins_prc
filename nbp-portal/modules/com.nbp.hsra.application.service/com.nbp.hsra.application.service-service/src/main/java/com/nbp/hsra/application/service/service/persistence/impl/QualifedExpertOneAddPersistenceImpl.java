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

import com.nbp.hsra.application.service.exception.NoSuchQualifedExpertOneAddException;
import com.nbp.hsra.application.service.model.QualifedExpertOneAdd;
import com.nbp.hsra.application.service.model.QualifedExpertOneAddTable;
import com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddImpl;
import com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.QualifedExpertOneAddPersistence;
import com.nbp.hsra.application.service.service.persistence.QualifedExpertOneAddUtil;
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
 * The persistence implementation for the qualifed expert one add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QualifedExpertOneAddPersistence.class)
public class QualifedExpertOneAddPersistenceImpl
	extends BasePersistenceImpl<QualifedExpertOneAdd>
	implements QualifedExpertOneAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QualifedExpertOneAddUtil</code> to access the qualifed expert one add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QualifedExpertOneAddImpl.class.getName();

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
	 * Returns all the qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching qualifed expert one adds
	 */
	@Override
	public List<QualifedExpertOneAdd> findBygetHsraById(
		long hsraApplicationId) {

		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @return the range of matching qualifed expert one adds
	 */
	@Override
	public List<QualifedExpertOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualifed expert one adds
	 */
	@Override
	public List<QualifedExpertOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualifed expert one adds
	 */
	@Override
	public List<QualifedExpertOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator,
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

		List<QualifedExpertOneAdd> list = null;

		if (useFinderCache) {
			list = (List<QualifedExpertOneAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QualifedExpertOneAdd qualifedExpertOneAdd : list) {
					if (hsraApplicationId !=
							qualifedExpertOneAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_QUALIFEDEXPERTONEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QualifedExpertOneAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<QualifedExpertOneAdd>)QueryUtil.list(
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
	 * Returns the first qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a matching qualifed expert one add could not be found
	 */
	@Override
	public QualifedExpertOneAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<QualifedExpertOneAdd> orderByComparator)
		throws NoSuchQualifedExpertOneAddException {

		QualifedExpertOneAdd qualifedExpertOneAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (qualifedExpertOneAdd != null) {
			return qualifedExpertOneAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchQualifedExpertOneAddException(sb.toString());
	}

	/**
	 * Returns the first qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualifed expert one add, or <code>null</code> if a matching qualifed expert one add could not be found
	 */
	@Override
	public QualifedExpertOneAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		List<QualifedExpertOneAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a matching qualifed expert one add could not be found
	 */
	@Override
	public QualifedExpertOneAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<QualifedExpertOneAdd> orderByComparator)
		throws NoSuchQualifedExpertOneAddException {

		QualifedExpertOneAdd qualifedExpertOneAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (qualifedExpertOneAdd != null) {
			return qualifedExpertOneAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchQualifedExpertOneAddException(sb.toString());
	}

	/**
	 * Returns the last qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualifed expert one add, or <code>null</code> if a matching qualifed expert one add could not be found
	 */
	@Override
	public QualifedExpertOneAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<QualifedExpertOneAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qualifed expert one adds before and after the current qualifed expert one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param qualifedExpertOneAddId the primary key of the current qualifed expert one add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a qualifed expert one add with the primary key could not be found
	 */
	@Override
	public QualifedExpertOneAdd[] findBygetHsraById_PrevAndNext(
			long qualifedExpertOneAddId, long hsraApplicationId,
			OrderByComparator<QualifedExpertOneAdd> orderByComparator)
		throws NoSuchQualifedExpertOneAddException {

		QualifedExpertOneAdd qualifedExpertOneAdd = findByPrimaryKey(
			qualifedExpertOneAddId);

		Session session = null;

		try {
			session = openSession();

			QualifedExpertOneAdd[] array = new QualifedExpertOneAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, qualifedExpertOneAdd, hsraApplicationId,
				orderByComparator, true);

			array[1] = qualifedExpertOneAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, qualifedExpertOneAdd, hsraApplicationId,
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

	protected QualifedExpertOneAdd getBygetHsraById_PrevAndNext(
		Session session, QualifedExpertOneAdd qualifedExpertOneAdd,
		long hsraApplicationId,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_QUALIFEDEXPERTONEADD_WHERE);

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
			sb.append(QualifedExpertOneAddModelImpl.ORDER_BY_JPQL);
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
						qualifedExpertOneAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QualifedExpertOneAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qualifed expert one adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (QualifedExpertOneAdd qualifedExpertOneAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(qualifedExpertOneAdd);
		}
	}

	/**
	 * Returns the number of qualifed expert one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching qualifed expert one adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUALIFEDEXPERTONEADD_WHERE);

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
		"qualifedExpertOneAdd.hsraApplicationId = ?";

	public QualifedExpertOneAddPersistenceImpl() {
		setModelClass(QualifedExpertOneAdd.class);

		setModelImplClass(QualifedExpertOneAddImpl.class);
		setModelPKClass(long.class);

		setTable(QualifedExpertOneAddTable.INSTANCE);
	}

	/**
	 * Caches the qualifed expert one add in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertOneAdd the qualifed expert one add
	 */
	@Override
	public void cacheResult(QualifedExpertOneAdd qualifedExpertOneAdd) {
		entityCache.putResult(
			QualifedExpertOneAddImpl.class,
			qualifedExpertOneAdd.getPrimaryKey(), qualifedExpertOneAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the qualifed expert one adds in the entity cache if it is enabled.
	 *
	 * @param qualifedExpertOneAdds the qualifed expert one adds
	 */
	@Override
	public void cacheResult(List<QualifedExpertOneAdd> qualifedExpertOneAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (qualifedExpertOneAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QualifedExpertOneAdd qualifedExpertOneAdd :
				qualifedExpertOneAdds) {

			if (entityCache.getResult(
					QualifedExpertOneAddImpl.class,
					qualifedExpertOneAdd.getPrimaryKey()) == null) {

				cacheResult(qualifedExpertOneAdd);
			}
		}
	}

	/**
	 * Clears the cache for all qualifed expert one adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QualifedExpertOneAddImpl.class);

		finderCache.clearCache(QualifedExpertOneAddImpl.class);
	}

	/**
	 * Clears the cache for the qualifed expert one add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QualifedExpertOneAdd qualifedExpertOneAdd) {
		entityCache.removeResult(
			QualifedExpertOneAddImpl.class, qualifedExpertOneAdd);
	}

	@Override
	public void clearCache(List<QualifedExpertOneAdd> qualifedExpertOneAdds) {
		for (QualifedExpertOneAdd qualifedExpertOneAdd :
				qualifedExpertOneAdds) {

			entityCache.removeResult(
				QualifedExpertOneAddImpl.class, qualifedExpertOneAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QualifedExpertOneAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QualifedExpertOneAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new qualifed expert one add with the primary key. Does not add the qualifed expert one add to the database.
	 *
	 * @param qualifedExpertOneAddId the primary key for the new qualifed expert one add
	 * @return the new qualifed expert one add
	 */
	@Override
	public QualifedExpertOneAdd create(long qualifedExpertOneAddId) {
		QualifedExpertOneAdd qualifedExpertOneAdd =
			new QualifedExpertOneAddImpl();

		qualifedExpertOneAdd.setNew(true);
		qualifedExpertOneAdd.setPrimaryKey(qualifedExpertOneAddId);

		qualifedExpertOneAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return qualifedExpertOneAdd;
	}

	/**
	 * Removes the qualifed expert one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add that was removed
	 * @throws NoSuchQualifedExpertOneAddException if a qualifed expert one add with the primary key could not be found
	 */
	@Override
	public QualifedExpertOneAdd remove(long qualifedExpertOneAddId)
		throws NoSuchQualifedExpertOneAddException {

		return remove((Serializable)qualifedExpertOneAddId);
	}

	/**
	 * Removes the qualifed expert one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qualifed expert one add
	 * @return the qualifed expert one add that was removed
	 * @throws NoSuchQualifedExpertOneAddException if a qualifed expert one add with the primary key could not be found
	 */
	@Override
	public QualifedExpertOneAdd remove(Serializable primaryKey)
		throws NoSuchQualifedExpertOneAddException {

		Session session = null;

		try {
			session = openSession();

			QualifedExpertOneAdd qualifedExpertOneAdd =
				(QualifedExpertOneAdd)session.get(
					QualifedExpertOneAddImpl.class, primaryKey);

			if (qualifedExpertOneAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQualifedExpertOneAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(qualifedExpertOneAdd);
		}
		catch (NoSuchQualifedExpertOneAddException noSuchEntityException) {
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
	protected QualifedExpertOneAdd removeImpl(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qualifedExpertOneAdd)) {
				qualifedExpertOneAdd = (QualifedExpertOneAdd)session.get(
					QualifedExpertOneAddImpl.class,
					qualifedExpertOneAdd.getPrimaryKeyObj());
			}

			if (qualifedExpertOneAdd != null) {
				session.delete(qualifedExpertOneAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (qualifedExpertOneAdd != null) {
			clearCache(qualifedExpertOneAdd);
		}

		return qualifedExpertOneAdd;
	}

	@Override
	public QualifedExpertOneAdd updateImpl(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		boolean isNew = qualifedExpertOneAdd.isNew();

		if (!(qualifedExpertOneAdd instanceof QualifedExpertOneAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(qualifedExpertOneAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					qualifedExpertOneAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in qualifedExpertOneAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QualifedExpertOneAdd implementation " +
					qualifedExpertOneAdd.getClass());
		}

		QualifedExpertOneAddModelImpl qualifedExpertOneAddModelImpl =
			(QualifedExpertOneAddModelImpl)qualifedExpertOneAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (qualifedExpertOneAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				qualifedExpertOneAdd.setCreateDate(date);
			}
			else {
				qualifedExpertOneAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!qualifedExpertOneAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				qualifedExpertOneAdd.setModifiedDate(date);
			}
			else {
				qualifedExpertOneAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(qualifedExpertOneAdd);
			}
			else {
				qualifedExpertOneAdd = (QualifedExpertOneAdd)session.merge(
					qualifedExpertOneAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QualifedExpertOneAddImpl.class, qualifedExpertOneAddModelImpl,
			false, true);

		if (isNew) {
			qualifedExpertOneAdd.setNew(false);
		}

		qualifedExpertOneAdd.resetOriginalValues();

		return qualifedExpertOneAdd;
	}

	/**
	 * Returns the qualifed expert one add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qualifed expert one add
	 * @return the qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a qualifed expert one add with the primary key could not be found
	 */
	@Override
	public QualifedExpertOneAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQualifedExpertOneAddException {

		QualifedExpertOneAdd qualifedExpertOneAdd = fetchByPrimaryKey(
			primaryKey);

		if (qualifedExpertOneAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQualifedExpertOneAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return qualifedExpertOneAdd;
	}

	/**
	 * Returns the qualifed expert one add with the primary key or throws a <code>NoSuchQualifedExpertOneAddException</code> if it could not be found.
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add
	 * @throws NoSuchQualifedExpertOneAddException if a qualifed expert one add with the primary key could not be found
	 */
	@Override
	public QualifedExpertOneAdd findByPrimaryKey(long qualifedExpertOneAddId)
		throws NoSuchQualifedExpertOneAddException {

		return findByPrimaryKey((Serializable)qualifedExpertOneAddId);
	}

	/**
	 * Returns the qualifed expert one add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add, or <code>null</code> if a qualifed expert one add with the primary key could not be found
	 */
	@Override
	public QualifedExpertOneAdd fetchByPrimaryKey(long qualifedExpertOneAddId) {
		return fetchByPrimaryKey((Serializable)qualifedExpertOneAddId);
	}

	/**
	 * Returns all the qualifed expert one adds.
	 *
	 * @return the qualifed expert one adds
	 */
	@Override
	public List<QualifedExpertOneAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qualifed expert one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @return the range of qualifed expert one adds
	 */
	@Override
	public List<QualifedExpertOneAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qualifed expert one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualifed expert one adds
	 */
	@Override
	public List<QualifedExpertOneAdd> findAll(
		int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the qualifed expert one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualifed expert one adds
	 */
	@Override
	public List<QualifedExpertOneAdd> findAll(
		int start, int end,
		OrderByComparator<QualifedExpertOneAdd> orderByComparator,
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

		List<QualifedExpertOneAdd> list = null;

		if (useFinderCache) {
			list = (List<QualifedExpertOneAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUALIFEDEXPERTONEADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUALIFEDEXPERTONEADD;

				sql = sql.concat(QualifedExpertOneAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QualifedExpertOneAdd>)QueryUtil.list(
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
	 * Removes all the qualifed expert one adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QualifedExpertOneAdd qualifedExpertOneAdd : findAll()) {
			remove(qualifedExpertOneAdd);
		}
	}

	/**
	 * Returns the number of qualifed expert one adds.
	 *
	 * @return the number of qualifed expert one adds
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
					_SQL_COUNT_QUALIFEDEXPERTONEADD);

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
		return "qualifedExpertOneAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUALIFEDEXPERTONEADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QualifedExpertOneAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the qualifed expert one add persistence.
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

		QualifedExpertOneAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QualifedExpertOneAddUtil.setPersistence(null);

		entityCache.removeCache(QualifedExpertOneAddImpl.class.getName());
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

	private static final String _SQL_SELECT_QUALIFEDEXPERTONEADD =
		"SELECT qualifedExpertOneAdd FROM QualifedExpertOneAdd qualifedExpertOneAdd";

	private static final String _SQL_SELECT_QUALIFEDEXPERTONEADD_WHERE =
		"SELECT qualifedExpertOneAdd FROM QualifedExpertOneAdd qualifedExpertOneAdd WHERE ";

	private static final String _SQL_COUNT_QUALIFEDEXPERTONEADD =
		"SELECT COUNT(qualifedExpertOneAdd) FROM QualifedExpertOneAdd qualifedExpertOneAdd";

	private static final String _SQL_COUNT_QUALIFEDEXPERTONEADD_WHERE =
		"SELECT COUNT(qualifedExpertOneAdd) FROM QualifedExpertOneAdd qualifedExpertOneAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"qualifedExpertOneAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QualifedExpertOneAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QualifedExpertOneAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QualifedExpertOneAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}